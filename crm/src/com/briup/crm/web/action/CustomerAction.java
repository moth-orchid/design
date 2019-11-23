package com.briup.crm.web.action;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.hibernate.criterion.DetachedCriteria;
import com.briup.crm.domain.Customer;
import com.briup.crm.domain.PageBean;
import com.briup.crm.service.CustomerService;
import com.briup.crm.util.UploadUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	private Customer customer=new Customer();
	private CustomerService customerService;
	/**
	 * 文件上传的三个属性
	 * @param customerService
	 */
	private String uploadFileName;
	private File upload;
	private String uploadContentType;
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	//新增客户的方法
	public String add() {
		return "add";
	}
	//使用set方法接受数据  进行分页显示
	private Integer currPage=1;
	
	public void setCurrPage(Integer currPage) {
		if(currPage==null) {
			this.currPage=1;
		}
		this.currPage = currPage;
	}
	
	//使用set方法接收每页显示记录数
	private Integer pageSize=3;

	public void setPageSize(Integer pageSize) {
		
		this.pageSize =pageSize;
	}
	//添加用户信息
	public String add2(){
		//保存客户  使用struts进行文件的上传与下载
		/**
		 * 字符串类型：上传项名称+filename
		 * 文件类型：上传项名称
		 * 字符串类型：上传项名称+ContentType
		 */
		if(upload!=null) {
			//文件上传
			//设置文件上传的路径
			String path="D:/upload";
			//一个目录下存在相同文件名：随机文件名  
			String uuidFileName = UploadUtils.getUuidFileName(uploadFileName);
			//一个目录下存放的文件过多：目录分离、
			String realPath=UploadUtils.getPath(uuidFileName);
			//创建目录
			String url=path+realPath;
			File file=new File(url);
			if(!file.exists()) {
				file.mkdirs();
			}
			//文件上传
			File dictFile=new File(url+"/"+uuidFileName);
			try {
				FileUtils.copyFile(upload, dictFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//设置image属性的值
			customer.setCust_image(url+"/"+uuidFileName);
		}
		//上传图片
		customerService.add(customer);
		return "addSuccess";
	}
	//显示客户信息
	public String findAll() {
		//接收参数  分页参数
		//最好使用DetachedCriteria对象（条件查询带分页）非常方便
		DetachedCriteria detachedCriteria=DetachedCriteria.forClass(Customer.class);
		System.out.println(currPage+"<<<");
		//调用业务层查询
		PageBean<Customer> pageBean=customerService.findByPage(detachedCriteria,currPage,pageSize);
		System.out.println(currPage+"<<<");
		System.out.println(pageSize+".....");
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}
	
	public String delete() {
		//先查询再删除
		customer=customerService.findById(customer.getCust_id());
		if(customer.getCust_image()!=null) {
			File file=new File(customer.getCust_image());
			if(file.exists()) {
				file.delete();
			}
		}
		customerService.delete(customer);
		return "deleteSuccess";
	}
	
	//进行修改客户
	public String edit() {
		//先进行查询再去修改
		customer=customerService.findById(customer.getCust_id());
		//有两种方法  第一种：手动压栈   第二种方法  由于模型驱动对象本身就在栈中  所以也可以不用管
		//如果使用第一种方法回显数据：<s:property value="cust_name"/>
		//如果使用第二种方法回显数据：<s:property value="model.cust_name"/>
		ActionContext.getContext().getValueStack().push(customer);
		return "edit";
	}
	
	//修改客户的方法
	public String update() {
		//文件向是否已经选择   如果选择  删除原有文件，上传新文件  如果没有  就是用原有的即可
		if(customer != null) {
			if(upload != null) {
				//已经选择 需要完成文件上传
				//删除原有文件
				String cust_image=customer.getCust_image();
				if(cust_image != null || !"".equals(cust_image)) {
					File file=new File(cust_image);
					file.delete();
				}
				//文件上传
				//设置文件上传的路径
				String path="D:/upload";
				//一个目录下存在相同文件名：随机文件名  
				String uuidFileName = UploadUtils.getUuidFileName(uploadFileName);
				//一个目录下存放的文件过多：目录分离、
				String realPath=UploadUtils.getPath(uuidFileName);
				//创建目录
				String url=path+realPath;
				File file=new File(url);
				if(!file.exists()) {
					file.mkdirs();
				}
				//文件上传
				File dictFile=new File(url+"/"+uuidFileName);
				try {
					FileUtils.copyFile(upload, dictFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				customer.setCust_image(url+"/"+uuidFileName);
				
			}
		}
		customerService.update(customer);
		
		return "updateSuccess";
	}
}
