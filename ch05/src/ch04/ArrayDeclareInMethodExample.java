package ch04;

public class ArrayDeclareInMethodExample {

	public static void main(String[] args) {
        //�迭�� �Ű������� �޴� �޼ҵ忡 �迭�� ���޽ÿ���
		//new Ÿ��[]{�ʱⰪ} ���·� ����
		//int[] arr={10,20,30};
		int sum2=add(new int[]{10,20,30,40,50});//�޼ҵ�� ���޽� �ʱⰪ���� �迭��ü �����Ͽ� ���� 
		//int sum2=add(arr);
		System.out.println("���:"+sum2);

	}
	
	
	public static int add(int[] scores) {//�迭�� �޼ҵ�� ���޵ɶ� length�� ����.
		int sum=0;
		for(int i=0;i<scores.length;i++)
			sum+=scores[i];
		return sum;
	}
	

}
