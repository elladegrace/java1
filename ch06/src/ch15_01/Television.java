package ch15_01;

public class Television {
	static String company="Samsong";
	static String model="LCD";
	static String info;
	
	//static �ʱ�ȭ �� {}
	//�ν��Ͻ� �ɹ��� �ü� ����,static�ɹ��� �ü� ����.
	static {
		info=company+"-"+model;
	}

	@Override
	public String toString() {
		return "Television [info=" 
	            + info + "]";
	}
	
}
