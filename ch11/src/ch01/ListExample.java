package ch01;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		//List list = new List();
		List list = new ArrayList();
		
		//����Ʈ�� ��ü ���� add(��ü)
		list.add("ȫ�浿");
		list.add("������");
		list.add("ȫ�浿");
		list.add("�Ӳ���");
		
		//size() ����� ����� ����
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));//����� index��ȣ�� ��
		
		
	}
}
