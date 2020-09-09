package com.love2code.Udemy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		
		//Load the configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve Bean from Spring Container
		Coach coach=context.getBean("myCricketCoach" , CricketCoach.class);
		
		//call Method on Bean
		System.out.println(coach.getDailyWorkOut());

		System.out.println(coach.getDailyFortune());
		
		//CricketCoach cc= new CricketCoach();
		System.out.println(coach.getTeam());
		
		System.out.println(coach.getEmail());
		//close context
		context.close();
	}

}
