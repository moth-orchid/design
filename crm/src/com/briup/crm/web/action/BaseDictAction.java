package com.briup.crm.web.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.briup.crm.domain.BaseDict;
import com.briup.crm.service.BaseDictService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

public class BaseDictAction extends ActionSupport implements ModelDriven<BaseDict>{
	BaseDict base=new BaseDict();
	private BaseDictService baseDictService;

	public void setBaseDictService(BaseDictService baseDictService) {
		this.baseDictService = baseDictService;
	}

	public void setBaseDict(BaseDictService baseDict) {
		this.baseDictService = baseDict;
	}

	@Override
	public BaseDict getModel() {
		
		return base;
	}
	//根据类型模拟工程查询字典的方法
	public String findByTypeCode() {
		
		//调用业务层查询
		List<BaseDict> list=baseDictService.findByTypeCode(base.getDict_type_code());
		//将list转换成json   jsonlib/fastjson可以直接将对象或者集合转换成json
		/**
		 * JsonConfig：转json的配置对象  只需显示部分内容的时候需要用到
		 * JSONArray:将数组与list集合转换成json
		 * JSONObject：将对象于map转换成json
		 */
		JsonConfig jsonConfig=new JsonConfig();
		//写一个数组，不想使用谁就可以在里面写入
		jsonConfig.setExcludes(new String[] {"dict_sort","dict_enable","dict_memo"});
		JSONArray json = JSONArray.fromObject(list,jsonConfig);
		//将JSON打印到页面
		ServletActionContext.getResponse().setContentType("text/html;charset=UTF-8");
		try {
			ServletActionContext.getResponse().getWriter().println(json.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return NONE;
		
	}
	
}
