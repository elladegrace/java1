package ch05;

import java.util.Scanner;

public class ArrayDeclareNotValuesExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Ÿ��[] ���� =new Ÿ��[����];
		int[] intArr = new int[5];
		
		//5���� ������ �Է��Ͽ� ����� ���ϴ� ���α׷�
	    for(int i=0;i<intArr.length;i++) {
	    	System.out.println((i+1)+"��° ���� �Է��ϼ���");
	    	intArr[i]=scanner.nextInt();//�迭�� �����.
	    }
		
	     int sum=0;
		 //�� ���
		 for(int i=0;i<intArr.length;i++) {
			  sum+=intArr[i];
		 }
		 System.out.println("���:"+sum/intArr.length);
	}
}
