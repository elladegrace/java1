package ch03;

public class VariableVSArraysExample2 {
	public static void main(String[] args) {
	  //����Ÿ���� ���� �ϳ��� ��� ��� 
	  int[] arr1= {10,20,30,40,50};//1�����迭 [10][20][30][40][50]
	  //int[] arr1= new int[]{10,20,30,40,50};//1�����迭 [10][20][30][40][50]
	  
	  //��ü ��
	  int sum=0;
	  for(int i=0;i<5;i++) {
		  sum+=arr1[i];//sum+=arr1[0];sum+=arr1[1];
		               //sum+=arr1[2];sum+=arr1[3];sum+=arr1[4];
	  }
	  
	  System.out.println(sum);
	  System.out.println((double)sum/5);
	  
	  
	  
	  
	  
	  

	}
}
