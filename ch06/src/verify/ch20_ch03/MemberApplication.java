package verify.ch20_ch03;

import java.util.Scanner;

public class MemberApplication {
	private static Member[] memberArray = new Member[100];
	private static Scanner scanner = new Scanner(System.in);
	
 public static void main(String[] args){
	  boolean run=true;
	while(run){
	    printMenu();
	   int selectNo = scanner.nextInt();
	if(selectNo==1){
	  createMember();
	}else if(selectNo==2){
	  memberList();
	}else if(selectNo==3){
	 deposit();
	}else if(selectNo==4){
	 withdraw();
	}else if(selectNo==5){
	  run=false;
	 }
	}
	System.out.println("���α׷� ����");
	}

	//ȸ�� �����ϱ�
  private static void createItem(){
   //ȸ��id
	  System.out.println("id>");
	  String id=scanner.next();
	//ȸ��id
	  System.out.println("��й�ȣ>");
	  String password=scanner.next();
 
	//ȸ���̸�
	  System.out.println("��ǰ��>");
	  String name=scanner.next();
     
	  for(int i=0;i<memberArray.length;i++)
		  if(memberArray[i]==null) {
	        memberArray[i]=new Member(id, password, name);
		  break;
		  }
	}

	//ȸ������Ʈ ����
	private static void stockList(){
	 //�ۼ���ġ
		for(Member m:memberArray) {
	    	 if(m!=null)
	    		 System.out.println(m);
	    }
	}

	//�԰�ó��
	private static void deposit(){
	  //��ǰ��ȣ ã��
     System.out.println("��ǰ��ȣ");
     String itemCode=scanner.next();
     //�԰�
     System.out.println("�԰�");
     int qty =scanner.nextInt();
 
     Item item=findItem(itemCode);    
     if(item!=null) {
    	 item.setQty(item.getQty()+qty);
     }else {
    	 System.out.println("�ش� ��ǰ�� �����ϴ�.");
     }
    
	}

	//����ϱ�
	private static void withdraw(){
		//��ǰ��ȣ ã��
	     System.out.println("��ǰ��ȣ");
	     String itemCode=scanner.next();
	     //�Աݾ�
	     System.out.println("�Աݾ�");
	     int qty =scanner.nextInt();
	 
	     Item item=findItem(itemCode);    
	     if(item!=null) {
	    	 if(item.getQty()-qty<0) {
	    		 System.out.println("����� ������� �����ϴ�.");
	    		 return;
	    	 }
	    	 item.setQty(item.getQty()-qty);
	     }else {
	    	 System.out.println("�ش��ǰ�� �����ϴ�.");
	     }
	}

	  //StockArray �迭���� itemCode�� ������ Item ��ü ã��
	private static Item findItem(String itemCode){
      for(int i=0;i<stockArray.length;i++) {
    	  if(stockArray[i]!=null) {
    		  Item item=stockArray[i];
    		  if(item.getItemCode().equals(itemCode)) return item;
    	  }
      }
	 //�ۼ���ġ
      return null;
	}	
	
	//�޴����
  static void printMenu() {
	System.out.println("--------------------------------------------");
	System.out.println("1.����� | 2.����� | 3.�԰�ó��| 4. ���ó��| 5.����");
	System.out.println("--------------------------------------------");
  }

	 
}
