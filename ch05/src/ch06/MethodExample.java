package ch06;

public class MethodExample {
	public static void main(String[] args) {
		

	}
	
	//1. �Ű��� �ް� , ����� �����ִ� �Լ� : Ÿ�� �޼ҵ��(Ÿ�� ����){return ��;}
	int method1(int value) {
		return value+10;
	}
	
   //2. �Ű��� �ް�, ����� �ǵ����������� �Լ�: void  �޼ҵ��(Ÿ�� ����){��;}
	void method2(int[] value) {
		System.out.println(value);
	}
	
	//3.�Ű��� �ȹް�, ����� �ǵ����ִ� �Լ� : Ÿ�� �޼ҵ��(){return ��;}
	int method3() {
		return 100;
	}
	
	//4. �Ű��� �ȹް�, ����� �ǵ��������ʴ� �Լ�: void �޼ҵ��(){��;}
	void method4() {
		System.out.println("����� ���⼭ ����ϰ� ����");
	}

}
