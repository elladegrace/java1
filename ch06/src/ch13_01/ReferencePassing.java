package ch13_01;

public class ReferencePassing {
	public static void main(String[] args) {
		Circle pizza = new Circle(10);
		
		//call by reference
		increase(pizza);
		
		System.out.println(pizza.radius);
	}
	
	//ȣ��� �Ű������� �����ϴ� �������� ���޵�.
	static void increase(Circle p) {//pizza������ ����Ű�� ��ü�� �ּҸ� ���޹���.
		p.radius=p.radius+1;
	}
}

class Circle{
	int radius;
	//�Ű����� 1��¥�� ������
	Circle(int radius){
		this.radius=radius;
	}
}
