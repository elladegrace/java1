package ch16;

public class SingleTonMainExample {

	public static void main(String[] args) {
		//������ ȣ��� ��ü ���� �Ұ�
		/* SingleTon obj1 = new SingleTon();
		 SingleTon obj2 = new SingleTon(); */
		
		//�ܺο��� ���ٰ����� public �������� getInstance()�޼ҵ�� ����
		SingleTon obj1 = SingleTon.getInstance();
		SingleTon obj2 = SingleTon.getInstance();
		
		//���������� ����Ű�� �ν��Ͻ��� �ּҰ� ������ ��
		if(obj1==obj2) {
			System.out.println("���� SingleTon ��ü �Դϴ�.");
		}else {
			System.out.println("�ٸ� SingleTon ��ü �Դϴ�.");
		}

	}

}
