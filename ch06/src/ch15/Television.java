package ch15;

public class Television {
	static String company="Samsong";
	static String model="LCD";
	String info;
	
	//�ʱ�ȭ �� {}
	//�ν��Ͻ� �ɹ�,static�ɹ� �Ѵ� �ü� ����.
	{
		info=company+"-"+model;
	}

	@Override
	public String toString() {
		return "Television [info=" 
	            + info + "]";
	}
	
	
}
