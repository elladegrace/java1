package ch08.ch04;

public class A {
	int field1=0;
	void method1() {System.out.println("�޼ҵ�A");}
	
}
class B extends A{
	//�ڽ�Ŭ����(B)���� �߰��� �ʵ� -�θ��ʵ忡�� ���� �ʵ�
	int field2=10;
	//�ڽ�Ŭ����(B)���� �߰��� �޼ҵ� -�θ��ʵ忡�� ���� �޼ҵ�
	void method2() {System.out.println("�޼ҵ�B");}
}
