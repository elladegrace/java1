package ch05;

public class OutterMain {
  public static void main(String[] args) {
	//�ٱ���ü ����
	Outter out=new Outter();
	//�ٱ� ��������.new ���ʰ�ü();
	Outter.Nested nested
		 =out.new Nested();
		
	nested.print();
		
		
	}

}
