package com.spring.ex2;

public class BoradImpl implements Board{
	String msg = "�Խù� ���";

	@Override
	public void board() {
		System.out.println(msg + "�ϱ�");
	}
}
