package ch02.ch01;

public class A {
  A(){ super();//��� Ŭ������ ObjectŬ������ ��ӹ���.
	  System.out.println("A�����ڰ� ���� ���� ����");
  }
}
class B extends A{
  B(){super();
	System.out.println("A������ ���� �� B������ ����");
 }
}

class C extends B{
   C(){super();
	   System.out.println("B������ ���� �� C������ ����");
   }
}

