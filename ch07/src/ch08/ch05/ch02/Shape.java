package ch08.ch05.ch02;

public class Shape {
	public Shape next;//�ڽ�Ÿ���� �ʵ� ����
	public Shape() {//��ü ������ �ʵ� �ʱ�ȭ
		next=null;
	}
	//�θ�ɹ��� �޼ҵ� 
    public void draw() {
	  System.out.println("Shape");	
	}
}

class Line extends Shape{
	public void draw() {//�������̵�
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {//�������̵�
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {//�������̵�
		System.out.println("Circle");
	}
}
