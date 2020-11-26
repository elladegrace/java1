package ch13_01;

public class ReferencePassing2 {
	public static void main(String[] args) {
		Circle pizza = new Circle(10);
		
		//call by reference
		increase(pizza);
		
		System.out.println(pizza.radius);
	}
	
	//ȣ��� �Ű������� �����ϴ� �������� ���޵�.
	static void increase(Circle p) {//pizza������ ����Ű�� ��ü�� �ּҸ� ���޹���.
			
		Circle newPizza = new Circle(p.radius);
		newPizza.radius++;
	}
}

