package ch06;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		
		//�߰���� - add(��ü), add(index,��ü), set(index,��ü)
		//����޼ҵ� add-append �ڿ� �߰�
		list.add("ȫ�浿");
		list.add("������");
		list.add("�Ӳ���");
	
		//���
		for(String s:list) System.out.println(s);
		
		//������ ��ġ�� ����- add(index,��ü)
		//�߰��� ��ü ���ԵǸ� �ڿ��ִ� ��ü���� �ϳ��� �ڷ� �ڵ��̵�.
		list.add(1, "������");//index��ȣ 1�� �ּҿ� ����
		
		//java.lang.IndexOutOfBoundsException ���� �߽�
		//�߰� ���Խ� index��ȣ�� ��ü�� size()��ȣ ���� ���� �����.
		//list.add(5,"�̼���");
		
		
		//����� ���� ���� index��ȣ�� ���� �� ���� �߻�
		//java.lang.IndexOutOfBoundsException ���� �߽�
		//list.remove(4);
		
		

	}

}
