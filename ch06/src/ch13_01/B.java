package ch13_01;

public class B {
	public static void main(String[] args) {
		//����Ÿ�԰�ü(�迭)
		int[] array= {1,2,3,4,5};
		
		increase(array);
		
		for(int i=0;i<array.length;i++)
		System.out.print(array[i]);
	}
	
	//���� ����
	static void increase(int[] arr) {
		arr[0]=99;
	}

}
