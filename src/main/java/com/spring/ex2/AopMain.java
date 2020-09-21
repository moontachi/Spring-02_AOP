package com.spring.ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		
//		
//		Login.login();
//		OrderImpl od = new OrderImpl();
//		od.order();
//		Dao dao = new Dao();
//		dao.dao();
//		Logout.logout();

		//aopExam.xml

		AbstractApplicationContext context = new GenericXmlApplicationContext("aopExam.xml");
		
		System.out.println("========��ǰ �ֹ��ϱ� ==========");
		Order myorder = (Order)context.getBean("myorder");
		myorder.order();
		
		System.out.println("======"
				+ "==�Խù� ����ϱ� ==========");
		Board myboard = (Board)context.getBean("myboard");
		myboard.board();
	}

	
}
