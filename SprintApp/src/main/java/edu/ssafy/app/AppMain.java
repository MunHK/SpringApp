package edu.ssafy.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
	public static void main(String[] args) {
//		Member m = new Member("둘리", 7);
//		System.out.println(m);
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
//		Member bean = (Member)ctx.getBean("member");
//		System.out.println(bean);
//		
//		
//		Member bean1 = ctx.getBean(Member.class);
//		System.out.println(bean1);
//		
//		if(bean == bean1) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		ctx.getBean(Dispatcher.class).doit(ctx);
	}
}
