package ch10;

public class AdvancedForExample2 {

	public static void main(String[] args) {
		int[][] scores= {{10,20,30},{40,50,60},{70,80,90}};
		
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			 for(int j=0;j<scores[i].length;j++)
			     sum=sum+scores[i][j];
		}
		System.out.println("����:"+sum+",���:"+(double)sum/9);
		
		sum=0;
		
		//���� for��
		for (int[] s : scores) {
			 for(int i:s) {
				sum=sum+i; //i�� ��ü ����� ó������ ������ �ѹ��� ��ȸ�ϸ鼭 ���� ������.
			 }
		}
		System.out.println("����:"+sum+",���:"+(double)sum/9);
		
	}

}
