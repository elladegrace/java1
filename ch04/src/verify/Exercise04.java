package verify;

//�ΰ��� �ֻ����� ������ ���� 5�� ������ ��� ����
public class Exercise04 {

	public static void main(String[] args) {
		int x=0,y=0;
	 
		//��������� �˼� ���� �� while��
	  while(true) {
		   x=(int)(Math.random()*6)+1;//1~6���� ������ �ڿ��� ����
		   y=(int)(Math.random()*6)+1;//1~6���� ������ �ڿ��� ����
		   if(x+y==5) break;//�ݺ����� ���������� ��ɹ� 
		   System.out.println(x+","+y);
	  }
	  System.out.println(x+","+y);
		
		

	}

}
