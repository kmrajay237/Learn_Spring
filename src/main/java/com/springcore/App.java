package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        
        Student student0 = (Student) context.getBean("Student0");
        System.out.println(student0);
        
        Student student1 = (Student) context.getBean("Student1");
        System.out.println(student1);
        
        Student student2 = (Student) context.getBean("Student2");
        System.out.println(student2);
        
        Student student3 = (Student) context.getBean("Student3");
        System.out.println(student3);
        
        Student student4 = (Student) context.getBean("Student4");
        System.out.println(student4);
        
        Student student5 = (Student) context.getBean("Student5");
        System.out.println(student5);
        
        Student student6 = (Student) context.getBean("Student6");
        System.out.println(student6);
    }
}
