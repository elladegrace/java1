package ch02;

public class OutterMain {
public static void main(String[] args) {
	//�ٱ�Ÿ��.����Ÿ�� ����=new �ٱ�Ŭ����.����Ŭ����();
	A.B b=new A.B();
	
	b.field1=3;//�ν��Ͻ� �ʵ�
	b.method1();//�ν��Ͻ� �޼ҵ�
	
	//static�ɹ�
	A.B.field2=3;
	A.B.method2();
	
	
	
}
}
