package ch09;

//�ʵ�,������, �޼ҵ尡 ���� �ҽ��ڵ� =>������ �� class���Ͽ��� �⺻������ A(){}�� ������.
public class A {
	//public A(int a) {}
	
}

//�ʵ常 �ִ� �ҽ��ڵ� => ������ �� class���Ͽ� int field1�� B(){} ������.
class B{
	//�ʵ�
	int field1;
}

//�ʵ�� �޼ҵ常 �ִ� �ҽ��ڵ� =>������ �� class���Ͽ� field�� C(){}�� method1(){}������.
class C{
	int filed1;
	void method1() {}
}
/* Ŭ������ ���� �ɹ� - �ʵ�, ������, �޼ҵ� */
//�ʵ�� �޼ҵ�� ������ ��� �ִ� �ҽ��ڵ� => ������ �� class���Ͽ� field, d(){}, method(){}����.
class D{
	int field;//�ɹ��ʵ�
	D(){}//������
	void method() {}//�ɹ��޼ҵ�
}