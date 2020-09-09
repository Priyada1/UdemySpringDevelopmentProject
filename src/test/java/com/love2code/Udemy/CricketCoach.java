package com.love2code.Udemy;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public CricketCoach() {
		System.out.println("Cricket Coach : no args constructor ");
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public void setEmail(String email) {
		
		System.out.println("set up Email inside Cricket Caoch");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("set up Team inside Cricket Caoch");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Inside Fortune Setter method for CricketCoach class");
	}
	
	public String getDailyWorkOut() {
		
		return "Practice Fast Bowling for 1 hr";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
