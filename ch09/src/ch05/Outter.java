package ch05;

public class Outter {
	String field="Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field="Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		//�޼ҵ�
	void print() {
	  System.out.println(this.field);//���ʸɹ� this.�ɹ�
		this.method();//���ʸɹ� this.�ɹ�
		
		//�ٱ��� �ɹ� ���� : �ٱ���.this.�ɹ�
		System.out.println(Outter.this.field);
		Outter.this.method();
		}
	}//Nested
	
	

}
