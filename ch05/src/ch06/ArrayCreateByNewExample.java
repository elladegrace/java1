package ch06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
	 //intŸ�� �迭�� �� ��ҵ��� 0���� �ʱ�ȭ�� [0][0][0]
	 int[] arr1 = new int[3];
	 for(int i=0;i<arr1.length;i++) {
		 System.out.println("arr1["+i+"]:"+arr1[i]);
	 }
	 System.out.println(arr1[1]+10);//0+10=>10
	 
	 //doubleŸ�� �迭�� �� ��ҵ��� 0.0���� �ʱ�ȭ��[0.0][0.0][0.0]
	 double[] arr2 = new double[3];
	 for(int i=0;i<arr2.length;i++)
		 System.out.println("arr2["+i+"]:"+arr2[i]);
	 
	 System.out.println(arr2[1]+10);//0.0+10=>10.0
	 
	 //booleanŸ�� �迭�� �� ��ҵ��� false�� �ʱ�ȭ��[false][false][false]
	 boolean[] arr3=new boolean[3];
	 for(int i=0;i<arr3.length;i++)
		 System.out.println("arr3["+i+"]"+arr3[i]);
	 
	 System.out.println(arr3[1]| true);//false | true =>true
	 
	 //����Ÿ���� �迭�� �� ��ҵ��� null�� �ʱ�ȭ ��[null][null][null]
	 String[] arr4=new String[3];
	 for(int i=0;i<arr4.length;i++)
		 System.out.println("arr4["+i+"]:"+arr4[i]);
	 //����Ÿ���� ��ҿ� ����
	 //System.out.println(arr4[1].length());
	 arr4[1]="hello";//[null]["hello"][null]
	 System.out.println(arr4[1].length());
	 
	 if(arr4[0]==null) {
		 System.out.println("�ش��Ұ� ���� ��� ����Ұ��մϴ�.");
	 }else {
		 System.out.println(arr4[0]);
	 }

	}

}
