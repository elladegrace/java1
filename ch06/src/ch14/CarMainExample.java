package ch14;

public class CarMainExample {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.name="�ҳ�Ÿ";
		c1.color="white";
		
		Car c2=new Car();
		c2.name="�׷���";
		c2.color="red";
		
		Car c3=new Car();
		c3.name="�ƹ���";
		c3.color="blue";

		//non-static�ɹ��� ȣ��
		//��ü ���� ��
		// ��������.�ɹ���
		c1.carInfo();
		c2.carInfo();
		c3.carInfo();
		
		//static�ɹ��� ȣ��
		//Ŭ������.�ɹ���
		Car.Calc();

	}

}
