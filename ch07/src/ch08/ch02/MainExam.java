package ch08.ch02;

public class MainExam {
  public static void main(String[] args) {
	//���� ������ ��ü���� �������� 
	 //�ǵ��ư����� ����
	A a=new B();
	B b=(B)a;
	
	//�ڽİ�ü���� ��ȯ �Ұ�
	//D d = (D)b;
	
	C c=new C();
	 a=c;
	C c2=(C)a;
	
	//���� ������ ��ü ���� �ڽ��� Ŭ����Ÿ������ ��ȯ �Ұ�
	//E e=(E)c2;
	
	//�������� D�̹Ƿ� A���� ��ȯ�ߴٰ� �ٽ� D���� ��ȯ ����.
	a=new D();
	b=(B)a;
	D d=(D)b;
	
	
	
	
	
	
	
	
	
	
	
	  
	}
}
