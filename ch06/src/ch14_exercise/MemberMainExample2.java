package ch14_exercise;

import java.util.ArrayList;
import java.util.List;

public class MemberMainExample2 {
	public static void main(String[] args) {
		List<Member> list
		=new ArrayList<Member>();
		
		//��ü ����
		list.add(new Member("ȫ�浿", "hong@naver.com"));
		list.add(new Member("������", "ilji@naver.com"));
		list.add(new Member("�Ӳ���", "im@naver.com"));

		//����ȸ�� ����
	    for(Member m:list) {
	    	m.info();
	    }
	    
	    //��ȸ����
	    System.out.println(list.size());
		
		
		
	}

}
