package verify;

public class MyGreetings {
	void greet(String ... names) {
		System.out.println("hello!!!");
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+",");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		MyGreetings mg=new MyGreetings();
		mg.greet("ȫ�浿","������","�Ӳ���");
		
		mg.greet("ȫ�浿","������","�Ӳ���","�̼���","������");
	}
}
