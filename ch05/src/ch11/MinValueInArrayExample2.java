package ch11;

//�ִ밪 ���ϱ�
public class MinValueInArrayExample2 {
	public static void main(String[] args) {
		int[] scores= {76,45,34,89,100,50,90,92};
		//�ִ밪 ���ϱ�
		//�ִ밪�� ������ ������ ���� �迭�� �ּҰ� ������ ���� ����
		int max=1;
		//�迭�� ó������ ������ �ݺ��ϸ鼭 max���� ������� ���� ��
		//max�� ���� �� ����� ������ ������ max���� �ٲ�ġ�⸦ �ݺ�.
		for(int i=0;i<scores.length;i++) {
			if(max < scores[i]) {
				max=scores[i];
			}//if��
		}//for��.
       System.out.println("�ִ밪:"+max);
       
       //���� for��
       max=1;
       for(int s : scores) {
    	   if(max<s) max=s;
       }
       System.out.println("�ִ밪:"+max); 
	}
}
