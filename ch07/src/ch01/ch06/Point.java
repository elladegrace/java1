package ch01.ch06;

public class Point {
	private int x,y;//��ǥ//��ӿ��� ����,�ڽ�Ŭ�������� ���� ���ٺҰ�
	public void set(int x, int y) {
		this.x=x; this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();//�θ�Ŭ������ public �޼ҵ� ȣ��
	}
}

