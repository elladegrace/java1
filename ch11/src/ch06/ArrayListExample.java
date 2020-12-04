package ch06;

import java.util.ArrayList;

public class ArrayListExample {
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
		
		for(String s:list) System.out.println(s);
		
		//������ ��ġ�� ��ü�� �ٸ� ��ü�� ��ü
		//set(index,��ü)
		list.set(2, "�̼���");
		
		for(String s:list) System.out.println(s);
		
		//�˻� ���
		boolean exists=list.contains("�̼���");
		System.out.println(exists);
		System.out.println(list.contains("������"));
		
		//Ư��index�� ��ü ��� get(index)
		String name=list.get(2);
		System.out.println(name);
		
		//��ü�� ����ִ��� Ȯ�� isEmpty()
		boolean isEmp = list.isEmpty();
		System.out.println(isEmp ? "�������" : "��ü�� ����Ʈ�� ����Ǿ�����");
		
		//list�� ����� ��ü�� ���� size()
		int size=list.size();
		System.out.println("����� ��ü��: "+size);
		
		//��ü ����
		String str=list.remove(0);//index��ȣ 0������ ��ü ����
		System.out.println("������ ��ü: "+str);
		System.out.println("���� �� ���� ��ü ��: "+list.size());
		
		//boolean = list.remove(��ü)
		boolean deleted = list.remove("������");
		System.out.println("�����Ǿ���?"+(deleted?"��":"�ƴϿ�"));
		
		//list�� ��� ��� ���� - clear()
		list.clear();
		System.out.println(list.isEmpty()?"��λ�����":"���� ��Ұ� ����");

	}

}
