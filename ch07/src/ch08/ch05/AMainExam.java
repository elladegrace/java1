package ch08.ch05;
public class AMainExam {
	public static void main(String[] args) {
		//��ӹ��� �ڽ�Ŭ��������
		//�θ�޼ҵ带 �������ϸ� ����� ������ �� �������� �����.
		//�޼ҵ� ����ÿ� �����ǵ� �޼ҵ������ ������.(�������ε�)
		A a =new B();
		 a.method1();
		 //a.method2();//���ٺҰ�
		 
		 B b=(B)a;
		 a.method1();

	}

}
