package com.example.demo.web.interceptor;

import com.example.demo.bean.Privilege;
import com.example.demo.service.PrivilegeSevice;
import com.example.demo.utils.CustomerException;
import com.example.demo.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @program: cms_jd1911
 * @description:
 * @author: charles
 * @create: 2019-11-18 21:02
 **/

public class JwtInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private PrivilegeSevice basePrivilegeService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    	
    	// 如果是options请求，直接返回true，不进行拦截
        if (request.getMethod().equals("OPTIONS")) {
            response.setStatus(HttpServletResponse.SC_OK);
            return true;
        }

        // 获取请求头信息authorization信息
		final String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY );
        System.out.println(token);
        if(StringUtils.isEmpty(token)){
            throw new CustomerException("用户还未登录");
        }
        // 验证token是否有效--无效已做异常抛出，由全局异常处理后返回对应信息
        JwtTokenUtil.parseJWT(token, JwtTokenUtil.base64Secret);
        // 验证权限，通过token获取用户id，通过用户id获取权限，这里可以使用redis将用户信息维护在缓存中，减少与数据库交互次数
        Long id = Long.parseLong(JwtTokenUtil.getUserId(token,JwtTokenUtil.base64Secret));
        this.auth(id,request.getServletPath());

        
        return true;
    }

    // 判断权限
    private void auth(Long userId,String path){
    	System.out.println(userId);
        List<Privilege> privileges = basePrivilegeService.findUserId(userId);
        System.out.println(privileges);
        for(Privilege p : privileges){
            System.out.println(p.getRoute());
        }
    }
}
