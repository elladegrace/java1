package ch09.ch03;

public abstract class A {
	void method() {}//��ü �޼ҵ�
	abstract void method2(); //�߻�޼ҵ�
}

abstract class B extends A{
	//�߻�޼ҵ� �߰�
	abstract void method3();
} 
//�߻�Ŭ������ �����Ǿ� ����� �߻�޼ҵ��
//��üŬ���������� ��� ������ �Ǿ�� �Ѵ�.
class C extends B{
	@Override
	void method3() {	}
	@Override
	void method2() {	}
}




