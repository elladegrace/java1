package ch14;

public class Car {
	//�ʵ�
	static int seq;//static�ɹ�
	//static�ɹ�
	//1.�����Ǵ°� �ƴϰ� �ε���.-��ü������ �����ϰ� ��밡��
	//2.�ش�Ŭ�������� �����ϰ� �ϳ��� ����
	//3.�ش�Ŭ������ ��� ��ü�� �����Ҽ� ����. 
	//non-static�ɹ�
	String name;
	String color;
	int no;
	//������
	public Car() {
		no = seq++;
	}
	//�޼ҵ�
	//static�ɹ�
	static void Calc() {
		System.out.println(seq+"��");
	}
	//non-static�ɹ�
	void carInfo() {
		System.out.println(no+",name:"
	               +name+",color:"+color);
	}
}
