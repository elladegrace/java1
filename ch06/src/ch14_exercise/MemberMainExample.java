package ch14_exercise;

public class MemberMainExample {
	public static void main(String[] args) {
		Member m1=
		new Member("ȫ�浿", "hong@naver.com");
		Member m2=
		new Member("������", "ilji@naver.com");
		Member m3=
		new Member("�Ӳ���", "im@naver.com");

		m1.info(); 
		m2.info();
		m3.info();
		
		Member.total();
		
		
		
	}

}
