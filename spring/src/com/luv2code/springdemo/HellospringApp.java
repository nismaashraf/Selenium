package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HellospringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext Context=new ClassPathXmlApplicationContext( "applicationContext.xml");
		 
		Coach theCoach=Context.getBean("myCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		Context.close();

	}

}
