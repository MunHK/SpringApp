package edu.ssafy.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/edu/ssafy/app/phone.properties") // 설정값이 정해진 source를 적어줌

public class Dispatcher {
	
	/*
	 * @Autowired
	 * 		ioc로부터 객체를 주입요청하는 어노테이션
	 * 		생성자, 객체변수, 메소드에 쓸 수 있다.
	 * 		상호호출의 문제점때문에 생성자에 붙이는 것을 추천한다.
	 */
	
	//@Autowired //기본생성자의 경우 null에러가 떠서 붙여줘야함
	ApplicationContext ctx; //혹시라도 ApplicationContext에서 Dispatcher를 호출 할 경우 문제가 발생
	@Value("${phone}")
	String phone;
	
	@Autowired // 생성자의 DI는 생략가능, ioc 컨테이너에 ctx 있으면 넣어줘 요청하는 어노테이션
	//생성자, set 메소드에 붙어 있을 수 있음
	public Dispatcher(ApplicationContext ctx) { 
		// 스프링프레임웤이 객체를 생성할때 생성자를 호출하는데 빈팩토리가 이미 ioc컨테이너 안에 있어서 인덱션하고있음(DI)
		this.ctx=ctx;
	}
	public void doit(BeanFactory ctx) {
		Phone p1 = (Phone)ctx.getBean(phone);//phone에 두개가 있어서 오류
		Phone p2 = (Phone)ctx.getBean("apple");
		
		System.out.println(p1);
		System.out.println(p2);
		p1.playMusic();
	}
}
// config해서 직접 빈으로 등록
// 컴포넌트로 만들어놓고 config에서 컴포넌트스캔

// 직접 다 내가 만들어야 했던 걸 이미 만들어져 있는 프레임워크를 통해 쉽게 사용함
// 어노테이션이나 파일을 쉽게 처리

//디스패처는 스프링프레임워크가 생성하면서 올라옴
//빈팩토리 말고 어플리케이션컨텍스트로 해도 빈을 받을 수 있음(어플리케이션컨텍스트에도 겟빈이 있음)
//