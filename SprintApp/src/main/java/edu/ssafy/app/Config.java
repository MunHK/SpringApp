package edu.ssafy.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"edu.ssafy.app"} )
public class Config {
	@Bean()
	public Member member() {
		return new Member("둘리", 7);
	}
}
