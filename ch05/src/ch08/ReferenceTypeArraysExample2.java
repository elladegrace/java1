package ch08;

public class ReferenceTypeArraysExample2 {
	public static void main(String[] args) {
		//����Ÿ�� �迭����
		String[] arr =new String[4];
		
		//����Ÿ�Թ迭�� ���
		//�迭�� ����Ұ� �ϳ��� ��ü�� �����Ҽ� ����.
		arr[0]="Java";
		arr[1]="Java";
		arr[2]="Java";
		arr[3]=new String("Java");
		
		
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));
		

	}
}
