package ch01.ch02;

public class A {
	int field1;
	void method1() {}
}

class B extends A{
	int field2;
	void method2() {
		
	}
}
//������ field�� �޼ҵ� ���� 
class C extends B{
	int field3;
	void method3() {
		field1=10;
		method1();
		field2=20;
		method2();
	}
}
//DŬ�������� field1, field2, method1(),method2()��� ���c��.
class D extends B{}

