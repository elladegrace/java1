package ch03.ch05;

//�θ������ ���� ȣ�� �޼ҵ� super(�Ű�����)
public class A {
	public A() {System.out.println("�⺻������ A");}
	public A(int x) {System.out.println("�Ű����� x ������ A");}
	public A(int x,int y) {System.out.println("�Ű����� x,y ������ A");}
	public A(int x,int y, int z) {System.out.println("�Ű����� x,y,z ������ A");}
	
}
class B extends A{
	//�θ�Ŭ������ �⺻������ ȣ��
	public B() {
	    super(10);//�θ�Ŭ������ �Ű������ִ� ������ ���� ȣ��	
		System.out.println("�⺻������ B");
	}
	//�θ�Ŭ������ �⺻������ ȣ��
	public B(int x) {
		super(x,10,20);
		System.out.println("�Ű����� x ������ B");}
	
	public B(int x, int y, int z) {
		this(x);
		System.out.println("�Ű����� x, y, z ������ B");
	}
}




