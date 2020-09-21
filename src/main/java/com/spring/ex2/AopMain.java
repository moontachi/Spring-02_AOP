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
		
		System.out.println("========상품 주문하기 ==========");
		Order myorder = (Order)context.getBean("myorder");
		myorder.order();
		
		System.out.println("======"
				+ "==게시물 등록하기 ==========");
		Board myboard = (Board)context.getBean("myboard");
		myboard.board();
	}

	
}
