package ch01;

//�ٸ���Ű��(ch02)�� �ִ� ���̺귯���� Ŭ������ 
//���� ������ Ŭ�������� ����ϱ� ���� import���� �̿��Ͽ� ����
// import ��Ű�����.�󸮺귯��Ŭ������;
import ch02.MySystem;

//Ŭ������ ��ü ��θ�: ch01.Caculator;

/* �ּ�: java���α׷��� Ŭ���� ���� �ִ� �޼ҵ�(method)�� ��ɾ��� �����. */
 class Calculator {
  //main�޼ҵ�-���α׷��� ������(�����)
 public static void main(String[] args) {
		//����Ÿ���� ������ ���� �� ���ÿ� ����30�� ����
		//int result=10+20;//��ɹ��ϳ�
		 int result;//����Ÿ���� ���� ����
		 result=10+20;//����Ÿ�� ������ 10+20�� �� ���� 30�� ����.
		 /* */
		//����Ÿ�� ���� result�� ����Ű�� ��������� �� 30��
		//����϶�.
		System.out.println("���:"+result);//��ɹ��ϳ�
		//Calculator�� ��ü ��θ�
		System.out.println(Calculator.class.getName());
		
		//����ڰ� ���� ���̺귯��Ŭ����
		MySystem.mysystem.out.println("my���:"+result);
	}
}
