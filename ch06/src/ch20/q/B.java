package ch20.q;

public class B {
	//Ŭ������ public�̶�
	//Ŭ�������� �ɹ��� default�̸� 
	//������Ű�������� ���� ����
	int n;
	void g() {
		n=5;
	}
}

class C{
	public void k() {
		//Ŭ������ public�̹Ƿ�
		//default�����ڴ� Ŭ������ ���������ڸ� ����
		//�⺻�����ڿ��� ���� ����
		B b=new B();
		//default �ʵ� ���� ����
		b.n=7;
		//default �޼ҵ嵵 ���� ����
		b.g();
	}
}
