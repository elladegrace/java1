package ch03;

public class TryCatchFinallyExam2 {
	public static void main(String[] args) {
		try {
			System.out.println("���ܹ߻�");
			throw new Exception("���� �߻�");
		} catch (Exception e) {
			System.out.println("���ܹ߻��� ���� ");
		}finally {
			System.out.println("������ �ݵ�� ����");
		}
	}
}
