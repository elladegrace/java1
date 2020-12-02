package verify.ch20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	  public static void main(String[] args){
	  boolean run=true;
	  while(run){
	   System.out.println("----------------------------------------------------");
	   System.out.println("1.���»��� | 2.���¸�� | 3.����| 4. ���| 5.����");
	   System.out.println("----------------------------------------------------");
	   int selectNo = scanner.nextInt();
	 
	if(selectNo==1){
	  createAccount();
	}else if(selectNo==2){
	  accountList();
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
  private static void createAccount(){
   //���¹�ȣ �Է�
	  System.out.println("���¹�ȣ>");
	  String ano=scanner.next();
   //������ �Է�
	  System.out.println("������>");
	  String owner=scanner.next();
   //�ʱ� �ݾ� �Է�
      System.out.println("�Աݾ�>");
     int balance=scanner.nextInt();
    //Account��ü ����
    Account acc =new Account(ano, owner, balance);
    for(int i=0;i<accountArray.length;i++) {
    	 if(accountArray[i]==null) { 
    		 accountArray[i]=acc;
    		 break;
    	 }
    }

	}

	//���¸�Ϻ���
	private static void accountList(){
	 //�ۼ���ġ
		for(int i=0;i<accountArray.length;i++) {
	    	 if(accountArray[i]!=null) {
	    		 Account acc=accountArray[i];
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
 
     Account acc=findAccount(ano);    
     if(acc!=null) {
    	acc.setBalance(acc.getBalance()+balance);
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
	 
	     Account acc=findAccount(ano);    
	     if(acc!=null) {
	    	 if(acc.getBalance()-balance<0) {
	    		 System.out.println("��ݾ��� �ܰ����� �����ϴ�.");
	    		 return;
	    	 }
	    	acc.setBalance(acc.getBalance()-balance);
	     }else {
	    	 System.out.println("�ش���¹�ȣ�� �����ϴ�.");
	     }
	}

	  //Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano){
      for(int i=0;i<accountArray.length;i++) {
    	  if(accountArray[i]!=null) {
    		  Account acc=accountArray[i];
    		  if(acc.getAno().equals(ano)) return acc;
    	  }
      }
	 //�ۼ���ġ
      return null;
	}	


	 
}