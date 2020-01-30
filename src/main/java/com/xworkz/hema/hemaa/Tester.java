package com.xworkz.hema.hemaa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		try {
			String metaInfo="spring.xml";
			ApplicationContext Spring = new ClassPathXmlApplicationContext(metaInfo);
			Rocket refOfRocket= Spring.getBean(Rocket.class);
			refOfRocket.launch();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
