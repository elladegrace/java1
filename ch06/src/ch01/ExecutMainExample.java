package ch01;

public class ExecutMainExample {

	public static void main(String[] args) {
		//��������
		Car c1=new Car();
		c1.color="red";
		c1.speed=200;
		
		Car sonata =new Car();
		sonata.color="white";
		sonata.speed=250;
		
		sonata.run();//�����ϴ� ��ü�� �޼ҵ� ���� -�޼ҵ� ȣ��� ����
		sonata.stop();
	}

}
