package ch05.ch01;

public class MyExam {
	void method1() {
		method2();
	}

	void method2() {
		//���� ���� �߻� ��Ű��
		// throw new ���ܰ�ü ������();
		try {
		throw new Exception("m2���ܹ߻�");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		MyExam m=new MyExam();
		m.method1();
	}
}

