package ch02;

public class NullExam4 {
	public static void main(String[] args) {
		String data=null;
		try {
			
		  System.out.println(data.length());
		  
		  System.out.println(args[1]);
		  
		  Animal animal = new Dog();
		  Cat cat=(Cat)animal;
		  
		 //���� catch�� 
		//}catch(Exception e4) {
		//		System.out.println("���ܹ߻�");	
		}catch(NullPointerException e1) {
			System.out.println("���ܹ߻�");
		}catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("���ܹ߻�");
		}catch(ClassCastException e3) {
			System.out.println("���ܹ߻�");
		//���� �����ϼ��� �Ʒ���, ���� ���ܰ�ü�ϼ��� ���� ��ġ
		}catch(Exception e4) {
		   System.out.println("���ܹ߻�");	
		}
		
	}
}