package ch03;

public class VariableVSArraysExample5 {
	public static void main(String[] args) {
	  //�迭������ ���߿� �迭��ü�� �����ؼ� ���Խô� new �迭[]{�ʱⰪ}���� ���� 
	  int[] arr1;
	  arr1=new int[]{10,20,30,40,50};//1�����迭 [10][20][30][40][50]
	  //�迭���� �� ������ index��ȣ�� ����
	  System.out.println(arr1[2]);
	  
      //arr1�� ����Ű��(�����ϴ�)�迭�� �ι�° ���� �׹�° ���� ���� ����� ����° ������ ����
	  arr1[2]=arr1[1]+arr1[3];//arr1[1](20)+arr1[3](40)=>60 ->arr1[2];
	  System.out.println(arr1[2]);
	  
	  
	  //
	  int i=0;
	  System.out.println(++arr1[i]);//�迭�ǳ��� �� ����
	  System.out.println(arr1[++i]);//�迭�� index����
	 
	  
	  
	  
	  
	  
	  

	}
}
