package ch15_02;

public class InstanceStaticExample {
  //�ʵ�
	int field1;
	void mehtod1() {}
	
	//
	static int field2;
	static void method2() {}
	
	
	//�������
	static {
		//field1=10; -�ν��Ͻ��ɹ� �Ұ�
		//mehtod1(); -�ν��Ͻ� �ɹ� �Ұ�
		field2=10;
		method2();
	}
	
	static void method3() {
		//this.field1=10; -this�Ұ�
		//this.method1(); -this�Ұ�
		field2=10;
		method2();
	}

	public static void main(String[] args) {
		
	}

}
