package ch07.ch03;

public class MainExam {
	public static void main(String[] args) {
		Button button =new Button();
//���ٽ�
//�������̽��� �߻�޼ҵ尡 ���� �Ѱ�
//�����ǵ� �޼ҵ��� ����ΰ� ��ɹ��� �ϳ��� �� {}��������
//����ο� �����̿� ȭ��ǥ -> ǥ��.
button.setOnClickListener(()->System.out.println("��ȭ�� �̴ϴ�."));
	button.touch();
		
 button.setOnClickListener(()->System.out.println("�޼����� �����ϴ�."));
	button.touch();
		
	}
}
