package ch06.ch03;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
      //Vector<String> vector=new Vector<String>();	
		//new Vector<>() <-<>���� Ÿ�� ��������
		 Vector<String> vector=new Vector<>();
		 //��ü ����
		 vector.add("ȫ�浿");
		 vector.add("������");
		 vector.add("�Ӳ���");
		 
		 for(String s:vector)System.out.print(s+" ");
		 System.out.println();
		 
		 //����
		 vector.add(1,"������");
		 for(String s:vector)System.out.print(s+" ");
		 System.out.println();
		 
		 //��ü
		 vector.set(1, "�̼���");
		 for(String s:vector)System.out.print(s+" ");
		 System.out.println();
		 
		 //�˻�
		 System.out.println(vector.contains("�̼���"));
		 System.out.println(vector.get(2));
		 System.out.println(vector.size());
		 
		 //����
		 System.out.println(vector.remove(2));
		 System.out.println(vector.size());
		 System.out.println(vector.remove("�Ӳ���"));
		 vector.clear();
		 System.out.println(vector.isEmpty());
		 

	}

}
