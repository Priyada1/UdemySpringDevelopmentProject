package com.love2code.Udemy;

public class BaseballCoach implements Coach {

	//Define Private Field for the Dependency
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	
	public String getDailyWorkOut()
	{
		return "Spend 30 minutes on Batting Practice ";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
}
