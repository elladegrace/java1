package ch08.ch04;

public class AMainExample {
   public static void main(String[] args) {
	   B b= new B();
	   //�ڽİ�ü������ ��� ���ٰ���
	   b.field1=0;
	   b.field2=0;
	   b.method1();
	   b.method2();
	   
	   
	   //�ڽ�Ŭ������ ��ü(B)�� 
	   //�θ�Ÿ���� AŸ������ ����ȯ(promotion)
	   A a = b;
	   a.field1=0;
	   a.method1();
	   //���� AŬ������ ���� �ɹ��̹Ƿ� ���� �Ұ�
	   //a.field2=0;
	   //a.method2();
	   
	   //AŸ������ ��ȯ�� ��ü��
	   //�ٽ� ������ BŸ������ ��ȯ(casting)
	   B b2 =(B) a;
	   b2.field1=0;
	   b2.field2=0;
	   b2.method1();
	   b2.method2();
	   
	   
	   
}
	
}
