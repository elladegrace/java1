package ch04;

public class Outter {
	/* ���÷� ����� Ŭ�������� ���Ǵ� ������
	 * ������߸� �Ѵ�.
	 * */
	void method(final int arg) {//java 8���ʹ� int arg�� �����ص� ��.�׷��� ���
	  final int localVariable =1;//java 8���ʹ� int arg�� �����ص� ��.�׷��� ���
	  //arg= arg+10;
	  //localVariable=200;
	  //����Ŭ�������� ������ �ʴ� ������ ��밡��
	  int i=10;
	  i=20;
		
	  //���� Ŭ����
		class Inner{
			void method2() {
				int result=arg+localVariable;
			}
		}
	}

}
