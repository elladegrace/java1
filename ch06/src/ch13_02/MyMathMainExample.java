package ch13_02;

public class MyMathMainExample {
	public static void main(String[] args) {
		MyMath math=new MyMath();
		int result = math.plus(10, 20);
		System.out.println(result);
		
		//�޼ҵ带 ȣ���ϴ��ʿ��� �Ű�����Ÿ���� ���� �����ϸ�
		//�ش� �Ű�����Ÿ�Կ� �´� �޼ҵ带 ã�Ƽ� ��������.
		double dRes = math.plus(10.0, 10.5);

	}

}
