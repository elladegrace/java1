package ch04;

import java.util.HashMap;
import java.util.Map;

//3. "����" 30��, "����¡" 25��, "����" 28�� 
public class MapExample {
	public static void main(String[] args) {
     //Ű�� ������ ��ü �����ϴ� Map��ü ����
		Map map=new HashMap();
		
		//��ü ����,(Ű,��)
		map.put("����", 30);//Ű-"����", value=30 <-AutoBoxing
		map.put("����¡", new Integer(25));//Ű -"����¡"
		map.put("����", 28);//Ű-"����", AtuoBoxing
		
		
		//���
 int celcius=(Integer)map.get("����");//Integer�� ����Ǽ� ->int�� AutoUnBoxing
		System.out.println("������ �µ��� "+celcius+"�� �Դϴ�.");
		
 celcius=(Integer)map.get("����¡");//Integer�� ����Ǽ� ->int�� AutoUnBoxing
 System.out.println("����¡�� �µ��� "+celcius+"�� �Դϴ�.");
	
 System.out.println("������ �µ��� "+map.get("����")+"�� �Դϴ�.");
 
		
	}

}
