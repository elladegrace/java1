package ch02;

public class NullExam6 {
	public static void main(String[] args) {
		String data=null;
		try {
			
		  System.out.println(data.length());
		  
		  System.out.println(args[1]);
		  
		  Animal animal = new Dog();
		  Cat cat=(Cat)animal;
		  
		 //���� catch�� 1.7 ���� ����	
		}catch(NullPointerException | ArrayIndexOutOfBoundsException 
				   | ClassCastException  e) {
			System.out.println("���ܹ߻�");
		//���� �����ϼ��� �Ʒ���, ���� ���ܰ�ü�ϼ��� ���� ��ġ
		}catch(Exception e4) {
		   System.out.println("���ܹ߻�");	
		}
		
	}
}