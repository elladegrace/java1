package ch02;

public class Parent {
	//�����ڴ� ��ӿ��� ���ܵ�.
	Parent(){
		System.out.println("Parent������ ȣ��");
	}
}

class Child extends Parent{
	//����� �ϸ� �⺻�����ڿ� super()�޼ҵ尡 ���Ե�.
	Child(){
		super();
		System.out.println("Child������ ȣ��");
	}
}
