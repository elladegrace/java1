package ch03.ch03;

//�θ������ ���� ȣ�� �޼ҵ� super(�Ű�����)
public class A {
	public A() {System.out.println("�⺻������ A");}
	public A(int x) {System.out.println("�Ű����� x ������ A");}
}
class B extends A{
	//�θ�Ŭ������ �⺻������ ȣ��
	public B() {System.out.println("�⺻������ B");}
	//�θ�Ŭ������ �⺻������ ȣ��
	public B(int x) {
		//�θ�Ŭ������ �⺻�����ڰ� �ƴ�
		//�Ű����� �ִ� �����ڸ� ȣ���Ҷ�
		//����ϴ� �޼ҵ� super(�Ű�����);
		super(x);
		System.out.println("�Ű����� x ������ B");
		}
}




