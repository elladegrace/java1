package ch07;

public class A {
	//default���������� �޼ҵ�
	void method1() {
		System.out.println("Ŭ����A�� �޼ҵ�");
	}
	
	void method2(int x) {
		System.out.println("Ŭ����A�� �޼ҵ� ,"+x);
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.method1();
	    B b= new B();
	    b.method1();
	    b.method2(10);
	}
}

class B extends A{
	//�θ�Ŭ������ �޼ҵ� Ÿ��,�̸�(�Ű�����)�� ����
	//method1()�� �ڽ�Ŭ�������� �ҽ��ڵ忡
	//��Ÿ�����Ƿ� ������
	void method1() {}
	//method2()�� �ҽ��ڵ忡�� ���������Ƿ� ������ �ƴ�
	
}


