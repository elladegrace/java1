package ch02;

//�������̽� ����
public interface MyInterface {
	//��� ����
   /* final static */int const1=0;//
	//�߻�޼ҵ� ����
	void method();
}
//��ü Ŭ������ �����ϸ� �������̽����� �߻�޼ҵ��
//����� �޼ҵ�� ������ �ؾ���.
class MyClass implements MyInterface{
	@Override
	public void method() {
       System.out.println("�������� �޼ҵ�");	
	}
}