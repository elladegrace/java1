package ch10_01;

public class AFiledsMainExample {
	public static void main(String[] args) {

		A a = new A();
   //�⺻����Ÿ Ÿ���� �ʵ��϶��� �⺻���� 0�̳� 0.0,false��
   //���� �ʱ�ȭ�Ǿ ���� �ȳ�.
		System.out.println(a.a);//int
		System.out.println(a.b);//byte
		System.out.println(a.c);//char
		System.out.println(a.d);//double
		System.out.println(a.s);//short
		System.out.println(a.l);//long
		System.out.println(a.f);//float
		System.out.println(a.bool);//boolean
		
		System.out.println(a.str);//String
		System.out.println(a.bb);//B
		//�ʵ尡 ����Ÿ���϶��� null�� �ʱ�ȭ�Ǳ� ������
		//�ش��ʵ� ���ٽ� ���� �߻�
		//��ü �����Ͽ� �ʱ�ȭ �� �����ؾߵ�.
		System.out.println(a.str.length());//String
		
	}
}
