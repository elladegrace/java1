package verify.stock;

import java.util.Scanner;

public class StockApplication {
	private static Item[] stockArray = new Item[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int seq;//0 �ڵ��߹���
	
   //���ø����̼� ����
  public static void main(String[] args){
	boolean run=true;
	while(run){
		printMenu();
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
//���
private static void withdraw() {
	//��ǰ�ڵ�
	  System.out.println("��ǰ�ڵ�>");
	  String itemCode=scanner.next();
	 //����� ���� �Է�
	  System.out.println("������>");
	  int qty=scanner.nextInt();
	  //��ǰã��
	  Item item=findItem(itemCode);
	  if(item!=null) {//itemCode�� �´� ��ǰ�� ã���� ��
		  if(item.getQty()-qty>=0) {
			  int tempQty=item.getQty();//������� �ӽ�����
			  item.setQty(tempQty-qty);//������� - �������� ����
		  }else {
			  System.out.println("�������� ����� ������մϴ�.");
		  }
	  }else {//��ǰ�� ��ã���� ��
		  System.out.println("�ش��ǰ�� �������� �ʽ��ϴ�.");
	  }
}
//�԰�
private static void deposit() {
	//��ǰ�ڵ�
	  System.out.println("��ǰ�ڵ�>");
	  String itemCode=scanner.next();
	 //�԰��� ���� �Է�
	  System.out.println("�԰����>");
	  int qty=scanner.nextInt();
	  //��ǰã��
	  Item item=findItem(itemCode);
	  if(item!=null) {//itemCode�� �´� ��ǰ�� ã���� ��
		  int tempQty=item.getQty();//������� �ӽ�����
		  item.setQty(tempQty+qty);//������� + �߰������� ����
	  }else {//��ǰ�� ��ã���� ��
		  System.out.println("�ش��ǰ�� �������� �ʽ��ϴ�.");
	  }
}

//�����Ʈ
private static void stockList() {
	 //�ۼ���ġ
	for(Item item:stockArray) {
    	 if(item !=null) {
    		 System.out.println(item.toString()); 
    	 }
    }
}
//�ڵ忡 �´� ��ǰã�� �޼ҵ�
private static Item findItem(String itemCode){
	for(Item item:stockArray) {
		if(item!=null)
			if(item.getItemCode().equals(itemCode)) 
				 return item;
	}
	return null;
}
//�����
private static void createItem() {
	//��ǰ��
  System.out.println("��ǰ��>");
  String name=scanner.next();
 //�ʱ� ��� �Է�
  System.out.println("�ʱ����>");
  int qty=scanner.nextInt();
  
  //String.format("����",��);
  //"����" -%06d <-������(digit) 6:��ü ���ڸ�, 0:������� 0���� ä��
  Item item =new Item("88"+String.format("%06d",++seq), name, qty);
  for(int i=0;i<stockArray.length;i++) {
  	 if(stockArray[i]==null) { //��Ұ� ��������� ��ǰ ����, ������� ������ �������.
  		 stockArray[i]=item;
  		 break;//�ش� index�������� �����ϰ� ��������.
  	 }
  }
}
 private static void printMenu() {
  System.out.println("--------------------------------------------");
  System.out.println("1.����� | 2.����� | 3.�԰�ó��| 4. ���ó��| 5.����");
  System.out.println("--------------------------------------------");
 }
  
}
