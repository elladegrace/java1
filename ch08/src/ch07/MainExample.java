package ch07;

public class MainExample {
	public static void main(String[] args) {
		InterfaceA a=new B();
		a=new C();
		
		//static�޼ҵ��
		//�������̽���.�޼ҵ�� ����
		InterfaceA.method3();
	}
}
