package ch06;

public class MyInterMainExam {
	public static void main(String[] args) {
		//�������̽� ���������� �������̽��� ������ ��� ��ü ���԰���
		//���������� ����Ű�� ��ü�� ��Ȳ�� ���� �ٸ���ü����.
		MyInterface mi=new M1();
		mi=new M2();
		mi=new M3();
		
		//�̸��� ���� �������̽� ����ü
		mi=new MyInterface() {};
		
	}

}
