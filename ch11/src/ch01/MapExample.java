package ch01;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
     // Map map=new Map();
		Map map=new HashMap();
		
		//map�� Ű�� ������ ��ü ����
		//put(Ű,��)
		map.put("ȫ�浿", "�����");
		map.put("������", "������");
		map.put("ȫ�浿", "��õ��");//Ű�� �ߺ��� ����Ű ����� ������ ��ü�� override��
		map.put("�Ӳ���", "�����");
		map.put("�̼���", "��õ��");//Ű�� �ٸ��� ���� �ش��ϴ� ���� �ߺ���.

		//get(Ű) ->���ϵǴ� ���� Ű�� �ش��ϴ� ��ü
		System.out.println(map.get("ȫ�浿"));
		System.out.println(map.get("������"));
		System.out.println(map.get("�Ӳ���"));
		System.out.println(map.get("�̼���"));
		

	}

}

