package ch03;

public class VariableVSArraysExample4 {
	public static void main(String[] args) {
	  //�迭������ ���߿� �迭��ü�� �����ؼ� ���Խô� new �迭[]{�ʱⰪ}���� ���� 
	  int[] arr1;
	  arr1=new int[]{10,20,30,40,50};//1�����迭 [10][20][30][40][50]
	  
	  //�迭�� ���̴� ����� ������.-������ �迭�� ���̰��� length��� �ʵ尡 ������ ����
	  System.out.println(arr1.length);
	  
	  //length�ʵ�� ������ ������ �б� ���� �ʵ�ν� �����Ұ�
	  //arr1.length=10;
	  
	  //��ü ��
	  int sum=0;
	  for(int i=0;i<arr1.length;i++) {
		  sum+=arr1[i];//sum+=arr1[0];sum+=arr1[1];
		               //sum+=arr1[2];sum+=arr1[3];sum+=arr1[4];
	  }
	  
	  System.out.println(sum);
	  System.out.println((double)sum/arr1.length);
	  
	  
	  
	  
	  
	  

	}
}
