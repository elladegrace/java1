package ch09;

public class SwallowVsDeepCopyExample {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		//arr�� �����ϰ��ִ� �迭��ü�� �ּҸ� arr2�� ����
		//����arr�� arr2�� ���� ��ü�� ����
		int[] arr2 = arr;
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		//arr1����
		arr[0]=9; arr[1]=8; arr[2]=7;
		
		System.out.println();
		//arr2�� ���뵵 ����
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		

	}

}
