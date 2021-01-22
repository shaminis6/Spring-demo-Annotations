package com.practice.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("restFortuneService")
	public FortuneService fortuneService;	
	
	/*public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return  "Hit ball multiple times";
	}
	
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doStartStuff()
	{
		System.out.println("Custom init gets called");
	}
	
	@PreDestroy
	public void doEndStuff()
	{
		System.out.println("Custom destroy gets called");
	}

}
