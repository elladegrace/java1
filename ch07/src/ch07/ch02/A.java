package ch07.ch02;

public class A {
	//�������� default
	void method1() {}

}
//
class B extends A{
	//�����ε��� �޼ҵ�� �θ�Ŭ������ �������� ���ٴ� ���� ���������� ����ؾ���.
	@Override//�޼ҵ带 ������ �ߴٴ� ǥ��
	public void method1() {
		System.out.println("������");
	}
	//�޼ҵ� �����ε�
	private void method1(int x){}
}
