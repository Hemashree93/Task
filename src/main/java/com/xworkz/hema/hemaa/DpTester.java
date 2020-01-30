package com.xworkz.hema.hemaa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DpTester {
	public static void main(String[] args) {
		ApplicationContext Spring = new ClassPathXmlApplicationContext("spring.xml");
		Rocket refOfrocket=Spring.getBean(Rocket.class);
		
		Labour refOflabour=Spring.getBean(Labour.class);
		refOfrocket.launch();
		refOflabour.work();

	}

}
