package ch08.ch05.ch02;

public class UsingOverride {
	public static void main(String[] args) {
	 Shape start, last, obj;
	 //��ũ�帮��Ʈ�� ���� �����Ͽ� ����
	 //��ü���������� ���ԵǴ� ��ü�� ���� �޶���
	 //��ü�� ������
	 start = new Line(); // Line ��ü ����
		last = start;
		
		obj = new Rect();
		last.next = obj; // Rect ��ü ����
		last = obj;
		
		obj = new Line(); // Line ��ü ����
		last.next = obj;
		last = obj;
		
		obj = new Circle(); // Circle ��ü ����
		last.next = obj;
	 
		//��� ���� ���
		Shape p=start;
		while(p!=null) {
			p.draw();
			p=p.next;
		}
	 
		Shape[] shapes= {new Line(),new Rect(), new Line(),new Circle()};
		for(Shape s:shapes)
			s.draw();

	}

}
