package ch06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MyMainExample {
	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
		Map<String,CommandAction> map
     = new HashMap<String,CommandAction>();
     
     map.put("write", new WriteAction());
     map.put("read", new ReadAction());
     map.put("list", new ListAction());
     map.put("reply", new ReplyAction());
     map.put("update", new UpdateAction());
     map.put("delete", new DeleteAction());
  //map -Ű, ������ ��ü�� ����
   Set<String> menuList =map.keySet();
   
    for(String s:menuList)
    	System.out.print(s+"\t");
    
	System.out.println("\n ���ϴ� �۾��� �Է��ϼ���");
	String menu=scanner.next();
	
	//�޴��� �ش��ϴ� ��ü�� action()�޼ҵ� ����
	  CommandAction action=map.get(menu);
	  action.action();
	  
	  
	
	}
}
