package ch01;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
      //Set set=new Set();
		Set set=new HashSet();
		
		//add(��ü) - ����
		set.add("ȫ�浿");
		set.add("������");
		set.add("ȫ�浿");//set�� �ߺ��������� ����
		set.add("�Ӳ���");
		
	//���� ���	
	 System.out.println(set);	

	}
}
