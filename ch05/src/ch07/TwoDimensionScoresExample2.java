package ch07;
/*. ȫ�浿�� ����, ����, ���� ������ ���� 85, 90, 55 [85][90][55]{85,90,55}
�������� ����, ����, ���� ������ ���� 90, 77, 88 [90][77][88]{90,77,88}
�Ӳ����� ����, ����, ���� ������ ���� 87, 80, 66 [87][80][66]{87,90,66}
�Դϴ�.
������ ���� ������, �����
2���� �迭�� �����Ͽ� for������ ���Ͻÿ�. 
*/


public class TwoDimensionScoresExample2 {
  public static void main(String[] args) {
		
  int[][] scores ={{85,90,55},{90,77,88},{87,90,66}} ;
 
   int total=0;
   int count=0;
   
   for(int i=0;i<scores.length;i++) {
   	 int sum=0;
   	 for(int j=0;j<scores[i].length;j++) {
   		 sum+=scores[i][j];
   		 total+=scores[i][j];//��Ż�հ�
   		 count++;//���� �Ǽ�
      }
   	 System.out.println("�հ�:"+sum+",���:"
                         +(double)sum/scores[i].length);
     }
   //
   System.out.println("��Ż�հ�:"+total);
   System.out.println("��ü �Ǽ�:"+count);
   System.out.println("��ü ���:"+(double)total/count);
	}
}
