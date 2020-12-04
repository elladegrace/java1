package ch06.ch04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
	  //new HashSet<Ÿ��>() <- Ÿ�Ի������� 
	  Set<String> set=new HashSet<>();
	  
	  //����
	  set.add("ȫ�浿");
	  set.add("������");
	  set.add("ȫ�浿");
	  set.add("�Ӳ���");
	  
	  //����� ��ü ��
	  System.out.println(set.size());
	  //�������
	  System.out.println(set);
	  //��� ����
	  //set.iterator()�� Iterator��ü ����-������ set�� ����� ��ü����
	  //������ �ּҸ� �ľ��ؼ� �����س��� 
	  //��,���(��ü)���� ���������� ����.
	  Iterator<String> iterator=set.iterator();
	  //System.out.println(iterator.next());
	  //System.out.println(iterator.next());
	  //System.out.println(iterator.next());
	  
	  //Iterator�� ����Ű�� set�� ��ҵ��� �ּҰ� �����ϴ¿���Ȯ�� 
	  //hasNext()�޼ҵ� ���� 
	  while(iterator.hasNext()) {
		  String obj=iterator.next();
		  System.out.println(obj+" ");
	  }
	  System.out.println();
	  
	  //set�� �ش簴ü ���翩�� Ȯ�� contains(��ü)
	  System.out.println(set.contains("ȫ�浿"));
	  
	  //����
	  System.out.println(set.remove("ȫ�浿"));
	  
	  //ũ�� size()
	  System.out.println(set.size());
	  
	  //��ü ����
	  set.clear();
	  
	  //������� ����Ȯ��
	  System.out.println(set.isEmpty());
	  
	  

	}
}
