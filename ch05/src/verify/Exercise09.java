package verify;
import java.util.Scanner;//��ĳ�� java.util��Ű���� Scanner API

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;//��� ���� ���� Ȯ�� ����
		int studentNum = 0;//�л��� �Է� ����
		int[] scores = null;//�л� ���� ���� �迭
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.�л��� | 2. �����Է� | 3. ��������Ʈ | 4.�м� | 5. ���� ");
			System.out.println("-------------------------------------------------------------");
			System.out.print("����>");
			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				// �ۼ���ġ
  //�ۼ���ġ
			System.out.println("�л���>");
			studentNum = scanner.nextInt();//��ĳ�ʷ� �л��� �Է¹ޱ�
			scores =new int[studentNum];//�Է¹��� �л����� 1���� �迭 ����
		    //System.out.println(scores.length);//�迭�� �� �������� Nullpoint���� �߻�
			} else if (selectNo == 2) {
			 		// �ۼ���ġ
			  if(scores==null) {
				  System.out.println("���� �迭 ���� �� �Է��ϼ���!");
				  continue;
			  }
			  for(int i=0;i<scores.length;i++) {
				  System.out.println("score["+i+"]>");
				  scores[i]=scanner.nextInt();
			  }

			} else if (selectNo == 3) {
				// �ۼ���ġ
				int i=0;
				for(int s:scores) System.out.println("score["+i++ +"]:"+s);
			} else if (selectNo == 4) {
				// �ۼ���ġ
			 int max=0; int min=200;int sum=0; double avg=0.0;
			 for(int i=0;i<scores.length;i++)
				 if(max < scores[i]) max=scores[i];
			 
			 for(int i=0;i<scores.length;i++)
				 if(min > scores[i]) min=scores[i];
			 
			 for(int i=0;i<scores.length;i++)
				  sum+=scores[i];

			 //�������� ����
			 int temp=0;//�ӽ� ���� ����
			 for(int i=0;i<scores.length;i++)
				 for(int j=i+1;j<scores.length;j++) {
					  if(scores[i] < scores[j]) {//���������̸� ������ �������̾���ϴµ� ū���̸� �ٲ�ġ��
						  temp=scores[i];
						  scores[i]=scores[j];
						  scores[j]=temp;
					  }
				 }
			  //�������� ��.
			 System.out.println("�ְ�����:"+max);
			 System.out.println("�ְ�����:"+scores[0]);
			 System.out.println("��������:"+min);
			 System.out.println("��������:"+scores[scores.length-1]);
			 System.out.println("�������:"+(double)sum/scores.length);
			 System.out.println("��������Ʈ:");
			 for(int i=0;i<scores.length;i++) {
				 System.out.println((i+1)+"��:"+scores[i]);
			 }
				 
			  
			} else if (selectNo == 5) {
				run = false;
			}
		}//while�� ��.
		System.out.println("���α׷� ����");
	}
}