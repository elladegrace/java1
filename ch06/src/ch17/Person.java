package ch17;

public class Person {
	final static String nation="Korea";//����� ����� ���ÿ� �ʱ�ȭ ���־����.
	final String ssn;//�����ڿ��� �ʱ�ȭ�κ��� �־ ���������� �ƴ�
	String name;
	
	public Person(String ssn,String name) {
		this.ssn=ssn;//�����ڿ��� �ʱ�ȭ �κ��� �־ ���� ����ο��� �������� ����.
		this.name=name;
	}

}
