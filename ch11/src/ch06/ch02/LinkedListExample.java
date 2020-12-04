package ch06.ch02;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> list =  new LinkedList<String>();
		
		//��ü ����
		list.add("ȫ�浿");
		list.add("������");
		list.add("�Ӳ���");
		
		for(String s:list)System.out.print(s+" ");
		System.out.println();
		
		//����
		list.add(1,"������");
		for(String s:list)System.out.print(s+" ");
		System.out.println();
		
		//��ü ��ü
		list.set(1,"�̼���");
		for(String s:list)System.out.print(s+" ");
		System.out.println();
		
		//�˻�
		System.out.println(list.get(1));
		System.out.println(list.contains("������"));
		System.out.println(list.size());
		
		//����-remove()
		System.out.println(list.remove(3));
		System.out.println(list.remove("������"));
		list.clear();//��ü ����
		System.out.println(list.isEmpty());
		
		

	}
}
