package com.spring.ex1;

public class Order {
	public void order() {
		String msg = "��ǰ �ֹ�";
		Login.login(msg); // ������
		System.out.println(msg + "�ϱ�"); // �ٽɱ��
		Logout.logout(msg); // ������
	}
}
