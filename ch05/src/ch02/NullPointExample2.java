package ch02;

public class NullPointExample2 {

	public static void main(String[] args) {
		//����Ÿ�� �� �迭Ÿ���� ���� ����
		//Ÿ��[] ����=�迭��ü;
		int[] arr1 =null;
		
		//arr1[0] = 10;//NullPointerException�߻�
		
		//���� = new Ÿ��[���� ������ ����];
		arr1=new int[5];//intŸ���� �� 5���� ������ ���� ������ ������ ����
		arr1[0] =10;//heap������ ��������� �� ������� ����
		//������ �迭�� ����(�����Ҽ� �ִ� ����)
		System.out.println(arr1.length);
		
		arr1=null;//������ ���� ����
		System.out.println(arr1.length);//NullPointerException
		
		
		
		

	}

}
