package ch03;

public class TryCatchFinallyExam {
	public static void main(String[] args) {
		try {
			System.out.println("����ó��");
			
		} catch (Exception e) {
			System.out.println("���ܹ߻� ��������.");
		}finally {
			//���α׷� ������ �ʼ� �����ؾ��ϴ� �����
			//finally���� ���
			System.out.println("������ �ݵ�� ����");
		}
	}
}
