package verify.ch20_ch02;

import java.util.Scanner;

public class StockApplication {
	private static Item[] stockArray = new Item[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int seq;//0
	
	  public static void main(String[] args){
	  boolean run=true;
	while(run){
	   System.out.println("--------------------------------------------");
	   System.out.println("1.����� | 2.����� | 3.�԰�ó��| 4. ���ó��| 5.����");
	   System.out.println("--------------------------------------------");
	   int selectNo = scanner.nextInt();
	 
	if(selectNo==1){
	  createItem();
	}else if(selectNo==2){
	  stockList();
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

	  //���»����ϱ�
  private static void createItem(){
   //���¹�ȣ �Է�
	//  System.out.println("���¹�ȣ>");
	//  String ano=scanner.next();
   //������ �Է�
	  System.out.println("������>");
	  String owner=scanner.next();
   //�ʱ� �ݾ� �Է�
      System.out.println("�Աݾ�>");
     int balance=scanner.nextInt();
    //Account��ü ����
    //String.format("����",��);
    //"����" -%03d <-������(digit) 3:��ü ���ڸ�, 0:������� 0���� ä��
    Item acc =new Item("111-"+String.format("%03d",++seq), owner, balance);
    for(int i=0;i<stockArray.length;i++) {
    	 if(stockArray[i]==null) { 
    		 stockArray[i]=acc;
    		 break;
    	 }
    }

	}

	//���¸�Ϻ���
	private static void stockList(){
	 //�ۼ���ġ
		for(int i=0;i<stockArray.length;i++) {
	    	 if(stockArray[i]!=null) {
	    		 Item acc=stockArray[i];
	    		 System.out.println(acc.getAno()+","
	    		            +acc.getOwner()+","+acc.getBalance()); 
	    	 }
	    }
	}

	//�����ϱ�
	private static void deposit(){
		//���¹�ȣ ã��
     System.out.println("���¹�ȣ");
     String ano=scanner.next();
     //�Աݾ�
     System.out.println("�Աݾ�");
     int balance =scanner.nextInt();
 
     Item acc=findItem(ano);    
     if(acc!=null) {
    	acc.setQty(acc.getQty()+balance);
     }else {
    	 System.out.println("�ش���¹�ȣ�� �����ϴ�.");
     }
    
	}

	//����ϱ�
	private static void withdraw(){
		//���¹�ȣ ã��
	     System.out.println("���¹�ȣ");
	     String ano=scanner.next();
	     //�Աݾ�
	     System.out.println("�Աݾ�");
	     int balance =scanner.nextInt();
	 
	     Item acc=findItem(ano);    
	     if(acc!=null) {
	    	 if(acc.getQty()-balance<0) {
	    		 System.out.println("��ݾ��� �ܰ��� �����ϴ�.");
	    		 return;
	    	 }
	    	acc.setQty(acc.getQty()-balance);
	     }else {
	    	 System.out.println("�ش���¹�ȣ�� �����ϴ�.");
	     }
	}

	  //Account �迭���� ano�� ������ Account ��ü ã��
	private static Item findItem(String ano){
      for(int i=0;i<stockArray.length;i++) {
    	  if(stockArray[i]!=null) {
    		  Item acc=stockArray[i];
    		  if(acc.getItemCode().equals(ano)) return acc;
    	  }
      }
	 //�ۼ���ġ
      return null;
	}	


	 
}
