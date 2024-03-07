package com.SpringBootJavaConfig2.bean;

import lombok.Data;

@Data
public class Employee {
	private String ename;
	private String edept;
	private Address addr;	//HAS-A
}
