package verify;

//3�� ����� ���� ���ϱ�
public class Exercise03 {
  public static void main(String[] args){
   //sum���� ����
	 int sum=0;//�ʱ�ȭ
	  
   for(int i=1;i<=100;i++) {//i��  for�������� ����, ������ �����
	  if(i%3==0) {//i�� ���� 3���� ���� �������� 0�̸� 3�� ��� 
	     sum+=i;
	   }
   }
   //for�� �ۿ��� ����� ������ for�� �ۿ��� ��밡��.
   System.out.println("����:"+sum);

  }
}
