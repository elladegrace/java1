package ch10;

public class AdvancedForExample4 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[] a1;//�������迭�� ����� 1�����迭�� ��� ����
		int num;//1���� �迭�� ����� �⺻Ÿ���� ��� ����
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				  num=arr[i][j];
				  System.out.print(num);
			}//���� for��
			System.out.println();
		}//�ٱ��� for��
		
		//���� for��
		for(int[] a2:arr) {//int[][] arr
			    for(int k:a2) {
				 System.out.print(k);
			}
		   System.out.println();
		}

	}

}
