package edu.ssafy.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("apple")
public class ApplePhone implements Phone {
	@Autowired
	@Qualifier("JBLSpeaker")
	private Speaker speaker;
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("애플폰 파워온");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("애플폰 파워오프");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("애플폰 콜~~~");
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		speaker.sound();
	}

}
