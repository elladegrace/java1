package ch02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {
	public static void main(String[] args) {
		//List list = new List();
		//List list = new ArrayList();
		//List list = new LinkedList();
		List list = new Vector();
		
		//����Ʈ�� ��ü ���� add(��ü)
		list.add(new Integer(10));//��ü�� ����
		list.add(new Integer(20));//��ü�� ����
		list.add(new Double(10.5));//��ü�� ����
		list.add(new Boolean(true));//��ü�� ����
		list.add(50);//�⺻Ÿ���� AutoBoxing�Ǿ Integer(50)���� ����
		
		//size() ����� ����� ����
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));//����� index��ȣ�� ��
		 //50�� ����� Integer.toString()�޼ҵ忡 ���� 50���� ���
		
	}
}
