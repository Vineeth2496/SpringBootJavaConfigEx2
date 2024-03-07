package com.SpringBootJavaConfig2.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootJavaConfig2.bean.Employee;
@Component
public class TestJavaConfigRunner implements CommandLineRunner {

	@Autowired
	private Employee e;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(e);

	}

}
