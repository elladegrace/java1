package ch01;

public class OutterMain {
public static void main(String[] args) {
	//����Ŭ����B�� A�� �ν��Ͻ��ɹ�
	//�̹Ƿ�, A��ü ���� �� B��ü ����
	A a=new A();
	//�ٱ�Ŭ����.����Ŭ����Ÿ�� ����=�ٱ���������.new ����Ŭ����();
	A.B b=a.new B();
	
	//����Ŭ������ �ɹ� ����
	//���� ��������.�ʵ�, ���� ��������.�޼ҵ�
	b.field1=3;
	b.method1();
}
}
