package ch02;
//Ŭ������ ��ü ��θ�: ch02.Caculator;

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
		//Ŭ������ ��ü ��θ� ���
		System.out.println(Calculator.class.getName());
		
		//����� ���� ���̺귯�� ���
		MySystem.mysystem.out.println("my���:"+result);

	}
}
