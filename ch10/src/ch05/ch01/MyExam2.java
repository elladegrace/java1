package ch05.ch01;

public class MyExam2 {
	void method1() {
		try {
		method2();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void method2() throws Exception {
		//���� ���� �߻� ��Ű��
		// throw new ���ܰ�ü ������();
		throw new Exception("m2���ܹ߻�");
	}
	
	public static void main(String[] args) {
		MyExam2 m=new MyExam2();
		m.method1();
	}
}

