package ch01;

//����� ���ɹ��� �ʵ�� �޼ҵ�,�����ڴ� ��Ӵ�󿡼� ���� ��.
public class A {
	//�ʵ�
	int field1;
	
	//�޼ҵ�
	void method1() {
		System.out.println("A�� �޼ҵ�");
	}

}
//��� extends SuperŬ����
class B extends A{
	//�ڽ�(sub)Ŭ�������� �߰��� �ʵ�
	String field2;
	//�ڽ�(sub)Ŭ�������� �߰��� �޼ҵ�
	void method2() {
		field1=10;//���������� �����ϱ� ������ ���� ����
		method1();//���������� �����ϱ� ������ ���� ����
	}
}
//��� extends SuperŬ����
class C extends A{}


