package ch04;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/*
1."����", "����","����", "�뱸","�λ�" �� �ߺ��ؼ� �����ϰ� ����ϱ�
2."����", "����","����", "�뱸","�λ�" �� �ߺ����� �����ϰ� ����ϱ�
 */
public class ListAndSetExample {
	public static void main(String[] args) {
		//1."����", "����","����", "�뱸","�λ�" �� �ߺ��ؼ� �����ϰ� ����ϱ�
		  //List list = new ArrayList();
		 //List list = new LinkedList();
		 List list = new Vector();
		 //���� add(��ü);
          list.add("����");
          list.add("����");
          list.add("����");
          list.add("�뱸");
          list.add("�λ�");
          
         //��� get(index��ȣ)
         //����� ��ü�� ���� size()
          for(int i=0;i<list.size();i++)
        	   System.out.println(list.get(i));
          
         		 
		//2."����", "����","����", "�뱸","�λ�" �� �ߺ����� �����ϰ� ����ϱ�
		 Set set=new HashSet();
		 
		 //���� add(��ü)
		 set.add("����");
		 set.add("����");
		 set.add("����");
		 set.add("�뱸");
		 set.add("�λ�");
		 
		 //�������
		 System.out.println(set);
		 
		

	}
}
