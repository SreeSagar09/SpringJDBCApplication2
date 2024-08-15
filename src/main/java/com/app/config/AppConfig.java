package com.app.config;

import java.sql.JDBCType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {
	
	@Bean
	public DriverManagerDataSource driverManagerDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/practice_db");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root123");
		
		return driverManagerDataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(driverManagerDataSource());
		
		return jdbcTemplate;
	}
	
}
