package ch04.ch01;

//AutoCloseable����� �߰��ϸ�(AutoCloseable�������̽��� ����)
//try-with-resources�� ��밡��
//finally�� ���� �ڵ����� �ڿ����� ����
public class A implements AutoCloseable{
  public void close() throws Exception{
	  System.out.println("�ڵ�����");
  }
  public static void main(String[] args) {
	try(A a=new A()) {
		
	}catch(Exception e) {
	}
	/*
	 finally {
	  a.close();
	}
	*/
}
}
