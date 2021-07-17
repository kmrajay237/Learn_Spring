package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
		
		Employees emp0 = (Employees) context.getBean("emp0");
        System.out.println(emp0.getEmpName());
        System.out.println(emp0.getPhones());
        System.out.println(emp0.getCourses());
        System.out.println(emp0.getAddresses());
        System.out.println(emp0.getProps());
	}

}
