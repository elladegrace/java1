package ch01;

public class ExceptionExample1 {
	public static void main(String[] args) {
		int x=100;
		int y=0;
		int result=0;
		
		//���� �߻� �̸� �ľ��Ͽ� ȸ���ϱ�
		if(y!=0) {
		   result=x/y;	
		}else
			System.out.println("���Ұ�");
		
		System.out.println("���α׷� ����");
	
	}
}
