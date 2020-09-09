package com.love2code.Udemy;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach()
	{
		
	}

	public String getDailyWorkOut() {
		return "Run a Hard and complete 10 KM ";
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
