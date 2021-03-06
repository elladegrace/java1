package verify.ch20_ch02;

import java.util.Scanner;

public class StockApplication {
	private static Item[] stockArray = new Item[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int seq;//0
	
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
	System.out.println("프로그램 종료");
	}

	//상품재고 생성하기
  private static void createItem(){
   //상품명
	  System.out.println("상품명>");
	  String name=scanner.next();
   //초기 재고 입력
      System.out.println("초기재고>");
     int qty=scanner.nextInt();
    
    //String.format("포멧",값);
    //"포멧" -%06d <-십진수(digit) 6:전체 세자리, 0:빈공백은 0으로 채움
    Item item =new Item("88-"+String.format("%06d",++seq), name, qty);
    for(int i=0;i<stockArray.length;i++) {
    	 if(stockArray[i]==null) { 
    		 stockArray[i]=item;
    		 break;
    	 }
    }

	}

	//상품목록보기
	private static void stockList(){
	 //작성위치
		for(int i=0;i<stockArray.length;i++) {
	    	 if(stockArray[i]!=null) {
	    		 Item item=stockArray[i];
	    		 System.out.println(item.getItemCode()+","
	    		            +item.getName()+","+item.getQty()); 
	    	 }
	    }
	}

	//입고처리
	private static void deposit(){
	  //상품번호 찾기
     System.out.println("상품번호");
     String itemCode=scanner.next();
     //입고
     System.out.println("입고량");
     int qty =scanner.nextInt();
 
     Item item=findItem(itemCode);    
     if(item!=null) {
    	 item.setQty(item.getQty()+qty);
     }else {
    	 System.out.println("해당 상품이 없습니다.");
     }
    
	}

	//출고하기
	private static void withdraw(){
		//상품번호 찾기
	     System.out.println("상품번호");
	     String itemCode=scanner.next();
	     //입금액
	     System.out.println("입금액");
	     int qty =scanner.nextInt();
	 
	     Item item=findItem(itemCode);    
	     if(item!=null) {
	    	 if(item.getQty()-qty<0) {
	    		 System.out.println("출고량이 현재고보다 많습니다.");
	    		 return;
	    	 }
	    	 item.setQty(item.getQty()-qty);
	     }else {
	    	 System.out.println("해당상품이 없습니다.");
	     }
	}

	  //StockArray 배열에서 itemCode와 동일한 Item 객체 찾기
	private static Item findItem(String itemCode){
      for(int i=0;i<stockArray.length;i++) {
    	  if(stockArray[i]!=null) {
    		  Item item=stockArray[i];
    		  if(item.getItemCode().equals(itemCode)) return item;
    	  }
      }
	 //작성위치
      return null;
	}	
	
	//메뉴출력
  static void printMenu() {
	System.out.println("--------------------------------------------");
	System.out.println("1.재고등록 | 2.재고목록 | 3.입고처리| 4. 출고처리| 5.종료");
	System.out.println("--------------------------------------------");
  }

	 
}
