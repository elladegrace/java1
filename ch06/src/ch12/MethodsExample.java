package ch12;

public class MethodsExample {
	//�Ű����� �ް�, ����� �����ϴ� �޼ҵ�
	double method(int x, double y) {
		return x+y;//return ��;
	}
	
	//�Ű����� �ް�, ����� �������� �ʴ� �޼ҵ�
	void method1(double x, double y) {
		System.out.println(x+y);
	}
	
	void method1_1(double x, double y) {
		if(x>0)
		  return;//voidŸ�Ը޼ҵ忡�� return���� ���� ���� �ǹ�;
	    System.out.println(x+y);//return�� �Ʒ��� ����� ���� ����.	
	}
	
	//�Ű����� �ȹް� , ����� �����ϴ� �޼ҵ�
	double method2() {
		return 10.0;//return ��;
	}
	
	//�Ű����� �ȹް�, ����� �ǵ��� ���� �ʴ� �޼ҵ�
	void method3() {
		System.out.println(55);
	}
	
  public static void main(String[] args) {
	  MethodsExample m=new MethodsExample();
	  //����� �޼ҵ� ȣ��ô� �������� �Ű������� �Ѱ���. result=�޼ҵ��(��1,��2);
	  double result=m.method(10, 20);
	  //voidŸ�� �޼ҵ�� ȣ�⸸�ϰ� ���ϰ��� �������� - �޼ҵ��(��1,��2);
	  m.method1(10, 20);
	  // �Ű��� ���� ����� �����ϴ� �޼ҵ� ȣ�� result=�޼ҵ�();
	  result = m.method2();
	  //�Ű��� ����, ����� �������� �ʴ� �޼ҵ� ȣ��  �޼ҵ�();
	  m.method3();
	  
	  
	  
}

}
