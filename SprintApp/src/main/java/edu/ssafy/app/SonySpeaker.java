package edu.ssafy.app;

import org.springframework.stereotype.Component;

@Component("SonySpeaker")
public class SonySpeaker implements Speaker {

	@Override
	public void sound() {
		System.out.println("Sony 스피커에서 음악이 나와요");
	}

}
