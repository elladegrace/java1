package verify;

public class ComputerMainExample {

	public static void main(String[] args) {
		 Computer myCom=new Computer();
		 int[] values = {1,2,3};
		 
		 System.out.println(myCom.sum1(values));
		 
     
	//�޼ҵ�� �Ѿ���� �Ű����� �������� ��
		System.out.println(myCom.sum2(1,2,3));
		
		System.out.println(myCom.sum2(1));
		
		System.out.println(myCom.sum2(1,2,3,4,5,6));
		  // sum2����(new int[]{1,2,3,4,5,6})
	}
}
