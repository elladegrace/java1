package ch03;

public class C implements InterC {
	@Override
	public void method2() {
		System.out.println("��ü�޼ҵ�2");
	}
	@Override
	public void method1() {
		System.out.println("��ü�޼ҵ�1");
	}
	@Override
	public void method3() {
		System.out.println("��ü�޼ҵ�3");
	}
 
	public static void main(String[] args) {
		InterA a=new C();
		a.method1();
		//a.method2();
		//a.method3();
		
		InterB b=new C();
		b.method1();
		b.method2();
		//b.method3();
		
		InterC c=new C();
		c.method1();
		c.method2();
		c.method3();
		
		
	}
}
