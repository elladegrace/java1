package ch20.p;

public class B {
	//Ŭ������ public�̶�
	//Ŭ�������� �ɹ��� private�̸� 
	//������Ű�������� ���ٺҰ�
	private int n;
	private void g() {
		n=5;
	}

}

class C{
	public void k() {
		//Ŭ������ public�̹Ƿ�
		//default�����ڴ� Ŭ������ ���������ڸ� ����
		//�⺻�����ڿ��� ���� ����
		B b=new B();
		//private �ʵ� ���ٺҰ�
		//b.n=7;
		//private�޼ҵ嵵 ���ٺҰ�
		//b.g();
	}
}
