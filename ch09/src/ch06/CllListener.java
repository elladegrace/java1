package ch06;
public class CllListener implements Button.OnClickListener{
	@Override
	public void onClick() {
	System.out.println("��ȭ�� �̴ϴ�.");
	}
	
	//�޼ҵ��߰�
	public void method() {
		System.out.println("�߰��ȸ޼ҵ�");
	}
}
