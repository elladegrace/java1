package ch02;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
     // Map map=new Map();
		Map map=new HashMap();
		
		//map�� Ű�� ������ ��ü ����
		//put(Ű,��)
		map.put("ȫ�浿", new Integer(85));
		map.put("������", 90);//AtuoBoxing
		map.put("ȫ�浿", new Integer(88));//Ű�� �ߺ��� ����Ű ����� ������ ��ü�� override��
		map.put("�Ӳ���", 75);//AtuoBoxing
		map.put("�̼���", 80);//Ű�� �ٸ��� ���� �ش��ϴ� ���� �ߺ���.

		//get(Ű) ->���ϵǴ� ���� Ű�� �ش��ϴ� ��ü
		System.out.println(map.get("ȫ�浿"));
		System.out.println(map.get("������"));
		System.out.println(map.get("�Ӳ���"));
		System.out.println(map.get("�̼���"));
		

	}

}

