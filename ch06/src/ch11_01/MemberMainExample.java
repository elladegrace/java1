package ch11_01;

public class MemberMainExample {

	public static void main(String[] args) {
		Member defaultMember = new Member();
		System.out.println(defaultMember.name+","
		                   +defaultMember.age+","+defaultMember.address);
		
		Member gildong=new Member("�浿", 14, "�����");
		Member iljimae=new Member("������", 20, "������", "ilji@naver.com");
		iljimae.phone="010-111-1234";
		Member kkokjung=new Member("����", 25,"�����", "kk@naver.com","010-3297-0000");

	}

}
