package ch01.ch03;
// A3 -> A2 ->A1
class A1{
	int a1=34;
	void method1() {System.out.println("�� A1�޼ҵ�");}
}
class A2 extends A1{
	int a2=10;
	void method2() {System.out.println("�� A2�޼ҵ�");}
}

class A3 extends A2{
	void method3() {System.out.println("�� A3�޼ҵ�");}
}

public class Ex01 {
 public static void main(String[] args) {
	 //�θ� ����Ŭ������ �ɹ��� �ڽ�Ŭ������ ���� ����
	A2 a2 = new A2();
	A3 a3 = new A3();
	A1 a1 = new A1();
	System.out.println("a1="+a2.a1);//A1�� ��ӹ��� �ڽ�Ŭ���� A2���� A1�� �ɹ� ���ٰ���
	System.out.println("a2="+a2.a2);//A2���� �߰��� A2�� �ɹ� ���ٰ���
	a3.method1();//�θ�Ŭ������ �ɹ��� ���ٰ���
	a3.method2();
	a3.method3();
	
	
}
}
