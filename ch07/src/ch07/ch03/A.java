package ch07.ch03;

public class A {
	//�������� default
	void method1() {}
public static void main(String[] args) {
	A a=new A(); a.method1();
	B b=new B(); b.method1();
	C c=new C(); c.method1();
}
}
//
class B extends A{
	//�����ε��� �޼ҵ�� �θ�Ŭ������ �������� ���ٴ� ���� ���������� ����ؾ���.
	@Override//�޼ҵ带 ������ �ߴٴ� ǥ��
	public void method1() {
		System.out.println("������");
	}
	//�޼ҵ� �����ε�
	void method1(int x){}
}
class C extends B{
	//�����ε��� �޼ҵ�� �θ�Ŭ������ �������� ���ٴ� ���� ���������� ����ؾ���.
	@Override//�޼ҵ带 ������ �ߴٴ� ǥ��
	public void method1() {
		System.out.println("���⼭ �� ������");
	}
	
	//�޼ҵ� �����ε�
   void method1(int x){}//�̰͵� ������
}