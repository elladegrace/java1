package ch06.ch02;

public class Point {
	private int x,y;
	public Point() {	this.x=this.y=0;	}
	public Point(int x, int y) { this.x=x;this.y=y;	}
	
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y);//super()�޼ҵ带 ���ؼ� �θ�Ŭ������ private �ʵ忡 ���� ����
		this.color=color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}
