package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach theCoach1 = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		
		//System.out.println(theCoach.getDailyFortune());
		
		//System.out.println(theCoach== theCoach1);
		
		context.close();

	}

}
