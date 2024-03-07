package com.SpringBootJavaConfig2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.SpringBootJavaConfig2.bean.Address;
import com.SpringBootJavaConfig2.bean.Employee;

@Configuration
public class AppConfig {
	@Autowired
	private Environment env;
	//1 object = 1 method
	@Bean("aobj")
	public Address addr() {
		Address a=new Address();
		a.setHno(env.getProperty("my.data.hno"));
		a.setLoc(env.getProperty("my.data.loc"));
		return a;
	}
	//1 object = 1 method
	@Bean
	public Employee emp() {
		Employee e=new Employee();
		e.setEname(env.getProperty("my.data.ename"));
		e.setEdept(env.getProperty("my.data.edept"));
		e.setAddr(addr());
		return e;
	}
}
