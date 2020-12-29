package com.hcl.domain;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages= {"com.hcl"})
public class MyConfiguration {
	@Value("${driver}")
    String driver;
	@Value("${url}")
    String url;
	@Value("${username}")
    String username;
	@Value("${password}")
    String password;
	@Bean
	public static PropertyPlaceholderConfigurer getHolder()
	{
		PropertyPlaceholderConfigurer prop=new PropertyPlaceholderConfigurer();
		Resource re=new ClassPathResource("database.properties");
		prop.setLocation(re);
		return prop;
	}
	@Bean
	public DataSource getdataSource()
	{
		DriverManagerDataSource datasourse=new DriverManagerDataSource();
		datasourse.setDriverClassName(driver);
		datasourse.setUrl(url);
		datasourse.setUsername(username);
		datasourse.setPassword(password);
		return datasourse;
	}
}
