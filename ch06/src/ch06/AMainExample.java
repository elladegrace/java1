package ch06;

public class AMainExample {
  public static void main(String[] args) {
	//�θ�ü ������������ �θ�ü���� ��ӹ��� ��� ��ü�� ���԰���
	A a=new A();
	a=new B();
	a=new C();
	a=new D();
	
	B b=new C();
	b = new D();
	
	C c=new D();
  }
}
