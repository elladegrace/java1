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
	private static void createMember() {
		String id=null;
		//ȸ��id
		do {  
		     System.out.println("id>");
		     id=scanner.next();
		     if(findMember(id)!=null)
		    	 System.out.println("�̹� �����ϴ� id�Դϴ�.");
		     else
		    	 break;
		  }while(true); 
		
		//ȸ����й�ȣ
		  System.out.println("��й�ȣ>");
		  String password=scanner.next();
	 
		//ȸ���̸�
		  System.out.println("�̸�>");
		  String name=scanner.next();
	     
		  for(int i=0;i<memberArray.length;i++)
			  if(memberArray[i]==null) {
		        memberArray[i]=new Member(id, password, name);
			  break;
			  }
	
}
	//ȸ������Ʈ ����
	private static void memberList() {
	 //�ۼ���ġ
		for(Member m:memberArray) {
	    	 if(m!=null)
	    		 System.out.println(m);
	    }
	}

	//����Ʈ ����
	private static void deposit(){
	  //ȸ�� ã��		
		  System.out.println("id"); 
		  String id=scanner.next(); //�԰�
		  System.out.println("��������Ʈ"); 
		  double point =scanner.nextDouble();
		  Member member=findMember(id);
		  if(findMember(id)!=null) {
		     member.setPoint(member.getPoint()+point); 
		  }else { 
			 System.out.println("�ش� ȸ���� �����ϴ�."); 
		 }
	}

	//����Ʈ ����
	private static void withdraw(){
		//ȸ�� ã��		
		  System.out.println("id"); 
		  String id=scanner.next(); //�԰�
		  System.out.println("��������Ʈ"); 
		  double point =scanner.nextDouble();
		  Member member=findMember(id);
		  if(findMember(id)!=null) {
		     member.setPoint(member.getPoint() - point); 
		  }else { 
			 System.out.println("�ش� ȸ���� �����ϴ�."); 
		 }
	}

	  //StockArray �迭���� itemCode�� ������ Item ��ü ã��
	private static Member findMember(String id){
      for(Member member:memberArray) {
    	  if(member!=null)
    		  if(member.getId().equals(id)) return member;
      }
	 //�ۼ���ġ
      return null;
	}	
	
	//�޴����
  static void printMenu() {
	System.out.println("----------------------------------------------");
	System.out.println("1.ȸ����� | 2.ȸ����� | 3.����Ʈ����| 4.����Ʈ����| 5.����");
	System.out.println("----------------------------------------------");
  }

	 
}
