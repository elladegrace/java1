package ch01.ch04;

public class A {
	private int x;//private�̱� ������ �ܺο��� ���ٺҰ�
	public int getX() {//public�̹Ƿ� �ܺο��� getX()���ٰ���, getX()���� x�� ���ٰ���
		return x;
	}

  public static void main(String[] args) {
	 A a=new A();
	 //a.x;//�ܺο��� ���� ���� �Ұ�
	 a.getX();//
			 
}
}
