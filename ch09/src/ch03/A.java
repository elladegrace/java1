package ch03;

public class A {
	//�ɹ�
	void method() {//instance�ɹ�
		//���� Ŭ����
	  class D{//instance�ɹ����� instanceŬ����
		  D(){}//������
		  int field1;//�ν��Ͻ��ʵ�
		  //static int field2;//static�ɹ� �Ұ�
		  void method(){ System.out.println("D"); }
		  //static void method2() {}//static�ɹ� �Ұ�
	  }//class D
	  D d=new D();
	  d.field1=3;
	  d.method();
	}//method���� ��.
}
