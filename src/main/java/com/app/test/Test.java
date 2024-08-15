package com.app.test;

import java.sql.Types;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Number of Beans: "+applicationContext.getBeanDefinitionCount());
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println("Beans Names:");
		for (String string : beanDefinitionNames) {
			System.out.println(string);
		}
		
		JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
		
		String sql = "insert into employee (employee_code, employee_name, age, designation) values (?, ?, ?, ?)";
		
		int row1 = jdbcTemplate.update(sql, "A001", "Sree Sagar", 30, "Software Engineer");
		
		if(row1>0) {
			System.out.println("Record inserted successfully.");
		}
		
		Object[] arguments = {"A002", "Aravind", 27, "QA Engineer"};
		int[] argumentsTypes = {Types.CHAR, Types.CHAR, Types.INTEGER, Types.CHAR};
		int row2 = jdbcTemplate.update(sql, arguments, argumentsTypes);
		
		if(row2>0) {
			System.out.println("Record inserted successfully.");
		}
	}
}
