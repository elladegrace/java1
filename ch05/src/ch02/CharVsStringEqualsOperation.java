package ch02;

public class CharVsStringEqualsOperation {

	public static void main(String[] args) {
		//�⺻Ÿ�� ���� ���� �� �� �ʱ�ȭ
		char c1='A';
		char c2='A';
		
		//�⺻Ÿ�Կ����� ==������ ������ ����� ���� ��
		if(c1==c2) System.out.println("c1�� ���� c2�� ���� ����");
		
		//����Ÿ���� ���� ���� �� �� �ʱ�ȭ
		String s1=new String("hello");
		String s2=new String("hello");
		if(s1==s2) System.out.println("s1�� s2�� ����Ű�� �ּҰ� ����.");
		else System.out.println("s1�� s2�� ����Ű�� �ּҰ� �ٸ���");
		
		//s1�� ���� s2�� ���� ������ ��
		if(s1.equals(s2))System.out.println("s1�� s2�� ���� ����");
		else System.out.println("s1�� s2�� ���� �ٸ���");

	}

}
