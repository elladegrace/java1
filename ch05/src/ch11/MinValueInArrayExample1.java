package ch11;

public class MinValueInArrayExample1 {

	public static void main(String[] args) {
		int[] scores= {76,45,34,89,100,50,90,92};
		//�ּҰ� ���ϱ�
		//�ּҰ��� ������ ������ ���� �迭�� �ִ밪 �̻��� ���� ����
		int min=1000;
		//�迭�� ó������ ������ �ݺ��ϸ鼭 min���� ������� ���� ��
		//min�� ���� �� ����� ������ ũ�� min���� �ٲ�ġ�⸦ �ݺ�.
		for(int i=0;i<scores.length;i++) {
			if(min>scores[i]) {
				min=scores[i];
			}//if��
		}//for��.
       System.out.println("�ּҰ�:"+min);
       
       min=100;
       //���� for��
       for(int s:scores) {
			if(min>s) {
				min=s;
			}//if��
		}//for��.
       System.out.println("�ּҰ�:"+min);
	}
}
