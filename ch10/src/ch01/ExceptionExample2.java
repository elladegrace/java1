package ch01;

public class ExceptionExample2 {
	public static void main(String[] args) {
		int x=100;
		int y=0;
		int result=0;
		
		try {
	      result=x/y;
		}catch(Exception e) {
		  System.out.println("���ܹ߻�");
		}
		//catch������ ����ó���� �ϰԵǸ� ������� ���� ���� ��.
		System.out.println("���α׷� ����");
		
	}
}
