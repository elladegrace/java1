package ch08.ch05.ch02;

public class MethodOverridingEx {
	//�޼ҵ��� �Ű������� �پ��ϰ� ��ȭ��(������)
	//�������� �Ű��������� ��Ÿ��-�Ű������� ������.
	static void paint(Shape p) {
		p.draw();
	}

	//������ �޼ҵ�� �θ�Ÿ������ ��ȯ�Ǵ��� �����ǵ� �������� ����
	//����Ǵ� ������ �ڵ����� ����(���� ���ε�)
	public static void main(String[] args) {
		Shape s=new Shape();
		Line line=new Line();
		 s=line;
		 paint(s);
		 
		Rect r=new Rect();
		 s=r;
		paint(s);
		  
		s=new Circle();
		paint(s);
				
		//paint(line);
		//paint(new Shape());
		//paint(new Line());
		//paint(new Rect());
		//paint(new Circle());
	}
}
