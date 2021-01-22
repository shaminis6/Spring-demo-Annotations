package com.practice.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public FortuneService getFortune()
	{
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(getFortune());
	}

}
