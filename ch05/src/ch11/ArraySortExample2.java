package ch11;

//�迭�� ����-��������
public class ArraySortExample2 {
	public static void main(String[] args) {
	 int[] scores= {76,45,34,89,100,50,90,92};
	 int temp;
	 
	 for(int i=0;i<scores.length;i++) {
		 for(int j=i+1;j<scores.length;j++) {
			 if(scores[i] < scores[j]) {//������ �����ʺ��� ������
				 temp=scores[i];//���� �ӽ� ������ ���ʰ� ����
				 scores[i]=scores[j];//�����ʰ��� ���ʿ� ����
				 scores[j]=temp;//�ӽú����� ���� �����ʿ� ����
			 }
		 }//���� for��
	 }//�ٱ��� for��
	 
	 for(int k:scores) {
		 System.out.println(k);
	 }
	 
	}
}
