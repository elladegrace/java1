package ch09.ch02;

//Ŭ�������� �߻�޼ҵ尡 �����ϸ�
//�ش� Ŭ������ ������ �߻�Ŭ�����̴�.
public abstract class A {
	void method() {}
	//����θ� ����� �޼ҵ� - �߻�޼ҵ�
	abstract void absMethod();

}
//�θ�Ŭ������ �߻�޼ҵ��
//��ü �ڽ�Ŭ�������� �ݵ�� ������ �ؾ��Ѵ�.
class B extends A{
	@Override
	void absMethod() {
      System.out.println("��ü�޼ҵ�");
	}
}
//�߻�Ŭ������ ��ӹ��� Ŭ���������� �߻�޼ҵ� ������ ���ص� ��.
abstract class C extends A{}

//�߻�Ŭ������ ��ӹ��� �߻�Ŭ������ ��üŬ���� ������ �߻�޼ҵ�� ������ �ؾ���.
class E extends C{
	@Override
	void absMethod() {System.out.println("��ü�޼ҵ�");	 }
}

