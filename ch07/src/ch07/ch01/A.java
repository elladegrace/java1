package ch07.ch01;

public class A {
	void method1() {}

}
//
class B extends A{
	@Override//�޼ҵ带 ������ �ߴٴ� ǥ��
	void method1() {
		System.out.println("������");
	}
	//�޼ҵ� �����ε�
	void method1(int x){}
}
