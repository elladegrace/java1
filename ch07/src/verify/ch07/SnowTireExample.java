package verify.ch07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		
		//�θ����������� �ڽİ�ü�� �����ϸ�
		//�θ�Ÿ������ �ڵ�����ȯ
		//�̶�, �θ�Ÿ�Կ� �ִ� �ɹ�(�ʵ�,�޼ҵ�) �� ���ٰ���
		//�ڽ�Ŭ�������� �޼ҵ尡 ������ �Ǿ��ٸ�
		//�θ�Ÿ���� Ŭ�������� ����Ǵ� �޼ҵ��� �����
		// �����ǵ� �ڽ�Ŭ������ �޼ҵ峻��
		Tire tire = snowTire;
		snowTire.run();
		tire.run();
	}
}
