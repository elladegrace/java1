package ch05;

public class ArrayDeclareNotValuesExample {

	public static void main(String[] args) {
		//Ÿ��[] ���� =new Ÿ��[����];
		int[] intArr = new int[5];
		//length�� ������ ������� 
		System.out.println(intArr.length);
		
		//�� ����- 0���� �迭.length-1������ ���尡��
		 intArr[0]=10;
		 intArr[1]=20;
		 intArr[2]=30;
		 intArr[3]=40;
		 intArr[4]=50;
		 //intArr[5]=60;
		 
		 //�� ����
		 for(int i=0;i<intArr.length;i++)
			 intArr[i]=((int)(Math.random()*6)+1);
		 //�� ���
		 for(int i=0;i<intArr.length;i++)
			 System.out.println(intArr[i]);
		

	}

}
