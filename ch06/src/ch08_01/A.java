package ch08_01;

//�ڹٿ��� ��� Ŭ������ �ֻ���Ŭ������ ObjectŬ������ ��ӹ޾Ƽ� ����
public class A /*extends Object */{ //<-extends Object�ڵ�� �����Ͻ� �߰�
	public A() {System.out.println("A������ȣ��");}//default(�⺻) ������ -���� :��ü ������ �ʱ�ȭ��Ȱ
	
	 public static void main(String[] args) {
		  B b = new B();//�ҽ����Ͽ��� ������ �����Ͻ� �⺻������ B()�� �߰��Ǿ ȣ�Ⱑ��.
		  A a = new A();
	}	

}

class B{
	//public B() {}	//�����Ϸ��� �⺻ ������ �߰����� -��� Ŭ������ �����ڰ� ����
	
}