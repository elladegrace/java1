package ch16;

public class SingleTon {
	//�ڽ��� Ÿ�� �ʵ� ���� �� �ʱ�ȭ
	private static SingleTon instance=new SingleTon();
	//�����ڸ� �ܺο��� ȣ���Ҽ� ������ ĸ��ȭ
	private SingleTon() {}
	//��ü�� ȣ���ϴ� �޼ҵ� ����
	public static SingleTon getInstance() {
		//if(instance==null) instance=new SingleTon();//Lazy init
		return instance;
	}
	
	
	

}
