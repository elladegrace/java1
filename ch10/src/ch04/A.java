package ch04;

public class A {
  void close() {
	  System.out.println("�ڵ�����");
  }
  public static void main(String[] args) {
	A a=null;
	try {
		a=new A();
	}catch(Exception e) {
		
	}finally {
	  a.close();
	}
}
}
