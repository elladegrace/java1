package ch06;

public class Button {
	OnClickListener listener;
	
	//�޼ҵ��� �Ű����� - ������
	void setOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}
	
	void touch() {
		listener.onClick();//���� ��ü�� onClick() �޼ҵ� ȣ��
	    //listener.method();-�θ�Ÿ�Կ� ���� �޼ҵ�� ���� �Ұ�
	}
	//���� �������̽� ����
	interface OnClickListener{
		void onClick();
	}
}
