package ch20.r;

//�ɹ��� protected�̸� ���� ��Ű������ 
//default���������ڿ� ���� ����
public class B {
 private int k;//���ٺҰ�(��Ӱ���� ���ٺҰ�)
 protected int n;
 protected void g() {
	 n=5;
	 k=9;//����Ŭ������������ ���� ����
 }
}

//
class C{
	public void k() {
		B b =new B();//
		b.n=7;//������Ű������ ���ٰ���
		b.g();//������Ű������ ���ٰ���
	//	k=10;//������Ű�������� ���ٺҰ�(private)
	}
}
