package ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample2 {
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
		
		//map���κ��� key�鸸 �̾Ƽ� Set�� ����
		Set<String> keySet=map.keySet();
		//Set�� ����� key���� ��ȸ�� iterator����
		Iterator<String> iterator=keySet.iterator();
		
		//Set�� ����� key���� �ϳ��� ��ȸó��
		while(iterator.hasNext()) {
			String key=iterator.next();//set�� ����� key�ϳ��� ��������
			Integer value=map.get(key);
			System.out.println(key+"="+value);
		}
		
		
	   
	}

}
