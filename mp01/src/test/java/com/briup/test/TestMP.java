package com.briup.test;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baomidou.mybatisplus.plugins.Page;
import com.briup.bean.Employee;
import com.briup.dao.mapper.EmployeeMapper;

public class TestMP {
	private ApplicationContext iocContext = new   ClassPathXmlApplicationContext("applicationContext.xml");
	
	private EmployeeMapper employeeMapper=iocContext.getBean("employeeMapper",EmployeeMapper.class);

	private List<Employee> selectBatchIds;
	/*
	 * 插入操作
	 */
	@Test
	public void testCommonInsert() {
		Employee employee=new Employee();
		employee.setEmail("briup.com");
		employee.setLastName("lily");
		employee.setAge(18);
		employee.setGender(1);
		//insert方法再插入时，会根据实体类的每个属性进行非空判断，只有非空的属性
		//对应的字段才会出现在sql语句中
		employeeMapper.insert(employee);
		/*
		 * insertAllColumn方法不管是属性值是否为空，都会出现在sql语句中。
		 */
		//employeeMapper.insertAllColumn(entity);
		//获取当前数据在数据库中的主键值
		Integer key=employee.getId();
		System.out.println(key);
	}
	@Test
	public void testDataSource() throws SQLException {
		DataSource bean = iocContext.getBean("dataSource",DataSource.class); 
		Connection connection = bean.getConnection();
		System.out.println(connection);
	}
	
	//测试更新
	@Test
	public void testCommonUpdate() {
		//测试第一个方法---利用id值进行更新
		//初始化修改对象
		Employee employee=new Employee();
		employee.setId(5);
		employee.setAge(21);
		employee.setLastName("yhl");
		//employee.setEmail("yhl.com");
		employee.setGender(0);
		
		//会进行判空，如果为空则不会出现在sql语句中，
		//Integer result = employeeMapper.updateById(employee);
		//不会进行判空操作,会导致插入的值为空.需要在使用时进行判断
		employeeMapper.updateAllColumnById(employee);
		/* System.out.println(result); */
	}
	
	//测试查询
	@Test
	public void selectTest() {
		//1根据id进行查询
		/*
		 * Employee selectById = employeeMapper.selectById(7);
		 * System.out.println(selectById);
		 */
		
		//会把当前对对象非空的属性作为条件进行查询   
		Employee employee=new Employee();
		employee.setId(7);
		employee.setLastName("lily");
		
		//2通过多个列来进行查询
		//如果查询的列可以查到多条数据，则会报错
		/*
		 * Employee selectOne = employeeMapper.selectOne(employee);
		 * System.out.println(selectOne.toString());
		 */
		
//		List<Integer> idList=new ArrayList<>();
//		idList.add(11);
//		idList.add(8);
//		idList.add(1);
//		//3.根据提供的id值批量查询
//		List<Employee> emps=employeeMapper.selectBatchIds(idList);
//		System.out.println(emps);
		
//		Map<String, Object> columnMap=new HashMap<>();
//		columnMap.put("last_name", "tom");
//		columnMap.put("gender", 1);
//		//4.通过map封装条件查询
//		List<Employee> selectByMap = employeeMapper.selectByMap(columnMap);
//		System.out.println(selectByMap);
	
		//5.分页查询
		//没有借用limit进行分页，采用内存分页的机制
		List<Employee> selectPage = employeeMapper.selectPage(new Page<>(2,2), null);
		System.out.println(selectPage);
	}
	
	//6.删除数据
	@Test
	public void testDelete() {
		//根据id进行删除
//		Integer deleteById = employeeMapper.deleteById(12);
//		System.out.println(deleteById);
		
//		Map<String, Object> columnMap=new HashMap<>();
//		columnMap.put("last_name", "lily");
//		//2.根据条件进行删除
//		Integer deleteByMap = employeeMapper.deleteByMap(columnMap);
//		System.out.println(deleteByMap);
		
		List<Integer> idList=new ArrayList<>();
		idList.add(5);
		idList.add(6);
		idList.add(7);
		//3批量删除数据
		employeeMapper.deleteBatchIds(idList);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
