package ch02;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
      //Set set=new Set();
		Set set=new HashSet();
		
		//add(��ü) - ����
		set.add(new Integer(10));
		set.add(new Integer("20"));
		set.add(10);//AutoBoxing set�� �ߺ��������� ����
		set.add(30);//AutoBoxing
		
	//���� ���	
	 System.out.println(set);	

	}
}
