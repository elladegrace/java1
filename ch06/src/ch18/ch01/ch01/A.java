package ch18.ch01.ch01;

public class A {
	public static void main(String[] args) {
		A a=new A();
		//Ŭ������=���+Ŭ������
		System.out.println(a.getClass().getName());
		//��°��
//		/ch18.ch01.ch01.A 
		System.out.println(a.getClass().getCanonicalName());
		//��Ű����
		System.out.println(a.getClass().getPackage().getName());
		//��Ű���� ������ Ŭ������
		System.out.println(a.getClass().getSimpleName());
	}

}
