package ch11;

//�迭�� ����
public class ArraySortExample1 {
	public static void main(String[] args) {
	 int[] scores= {76,45,34,89,100,50,90,92};
	 int temp;
	 int sum=0;
	 
	 for(int i=0;i<scores.length;i++) {
		 for(int j=i+1;j<scores.length;j++) {
			 //�񱳷���
			 if(scores[i]>scores[j]) {//������ �����ʺ��� ũ��
				 temp=scores[i];//���� �ӽ� ������ ���ʰ� ����
				 scores[i]=scores[j];//�����ʰ��� ���ʿ� ����
				 scores[j]=temp;//�ӽú����� ���� �����ʿ� ����
			 }
		 }//���� for��
		 //���� ����
		 sum+=scores[i];
	 }//�ٱ��� for��
	 System.out.println("��: "+sum+",���: "+(double)sum/scores.length);
	 
	 for(int k:scores) {
		 System.out.println(k);
	 }
	 
	}
}
