package edu.ssafy.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "galaxy")
@Scope("singleton")	// prototype으로 주면 내가 getbean할 때마다 다른 객체가 오게 됨
					// singleton으로 주면 같은 객체가 감
public class Galaxy implements Phone {
	private Speaker speaker;
	
	@Autowired
	public Galaxy(@Qualifier("SonySpeaker") Speaker speaker) {
		this.speaker=speaker;
	}
	
	@Override
	public void powerOn() {
		System.out.println("갤럭시가 파워온");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOff() {
		System.out.println("갤럭시가 파워오프");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call() {
		System.out.println("갤럭시 콜");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMusic() {
		speaker.sound();
	}
	
}
