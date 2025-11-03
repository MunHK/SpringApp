package edu.ssafy.app;

import org.springframework.stereotype.Component;

@Component("JBLSpeaker")
public class JBLSpeaker implements Speaker {

	@Override
	public void sound() {
		System.out.println("JBL 스피커에서 음악이 나와요");
	}

}
