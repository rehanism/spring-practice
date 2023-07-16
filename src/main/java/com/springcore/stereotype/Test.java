package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		
		Student student = context.getBean("ob", Student.class);
		
//		System.out.println(student);
//		System.out.println(student.getAdress());
//		System.out.println(student.getAdress().getClass().getName());
		System.out.println(student.hashCode());
		Student student2 = context.getBean("ob", Student.class);
		System.out.println(student2.hashCode());

		Teacher teacher = context.getBean("teacher", Teacher.class);
		System.out.println(teacher.hashCode());
		Teacher teacher1 = context.getBean("teacher", Teacher.class);
		System.out.println(teacher1.hashCode());

	}

}
