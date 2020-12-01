package verify.ch18;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

//���������� ����Ű�� �ν��Ͻ��� �ּҰ� ������ ��
		if (obj1 == obj2) {
			System.out.println("���� SingleTon ��ü �Դϴ�.");
		} else {
			System.out.println("�ٸ� SingleTon ��ü �Դϴ�.");
		}
	}
}
//�̱���
class ShopService{
	//�ڽ�Ÿ���� �ʵ�
	private static ShopService instance=new ShopService();
	private ShopService() {}//������ ���� ���� private
	//��ü�� getInstance�� ����
	public static ShopService getInstance() {
		return instance;
	}
	
	
	
}