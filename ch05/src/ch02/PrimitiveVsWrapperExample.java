package ch02;

public class PrimitiveVsWrapperExample {
	public static void main(String[] args) {
		//�⺻Ÿ���� �� �� ����, �Լ��� ����
		int i=10;
		String result;
		
		 //����Ÿ�� = �⺻Ÿ�� ��
		//result = i;
		
		//����Ÿ���� �� ���� �� �ϰ� �����ϴ� �Լ��� ����
		Integer intValue = new Integer(10);
		result = intValue.toString();
		
		System.out.println(result);
		System.out.println(intValue.equals(10));
		
		
		
	}

}
