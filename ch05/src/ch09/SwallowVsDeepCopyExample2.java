package ch09;

public class SwallowVsDeepCopyExample2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		//������ ���ο� �迭�� ����� ������ �������� ���(��������)
		int[] arr2 = new int[arr.length];
		//�� ��� �����ϱ�
		for(int i=0;i<arr.length;i++)
			 arr2[i]=arr[i];
				
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
