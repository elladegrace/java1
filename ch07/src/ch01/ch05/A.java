package ch01.ch05;

public class A {
	private int x;//private�̱� ������ �ܺο��� ���ٺҰ�
	public int getX() {//public�̹Ƿ� �ܺο��� getX()���ٰ���, getX()���� x�� ���ٰ���
		return x;
	}
}

//������� ����
class B extends A{
	void method() {
		//System.out.println(x);
		System.out.println(getX());
	}
}
