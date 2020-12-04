package ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		//new HashMap<String, String>();//�������� new HashMap<>()
		Map<String, Integer> map=new HashMap<>();
		
		//Entry����
		map.put("����",200);
		map.put("����",100);
		map.put("�뱸",300);
		map.put("����",300);//Ű�� �ߺ��Ǹ� ������ ��ü value�� ��ü
		map.put("�λ�",150);
		
		//
		System.out.println(map.size());
		
		//map���κ��� Entry������ Set�� ����
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		//�ݺ���(itertor)�� Entry������ ����
		Iterator<Map.Entry<String, Integer>> iterator 
		                                 =entrySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	    //Ư��Ű�� ��ü �����ϱ�
	   System.out.println(map.get("����"));//������ Ȯ���ڼ� 
	   
	   //����
	   System.out.println(map.remove("�뱸"));
	   System.out.println(map.size());
	   
	   //��ü ����
	   map.clear();
	   System.out.println(map.isEmpty());
	   
	}

}
