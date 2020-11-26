package ch12;

public class MemberMethodsExample {
  // �Ű����� �ް�, ����Ÿ�� �ִ� �޼ҵ�
	Member method1(String name, int age, String address) {
		return new Member(name, age, address);
	}
	
	Member method1_1(Member m) {
		m.name="ȫ�浿";
		m.age=23;
		m.address="������";
		return m;
	}
	
  // �Ű����� �ް�, ����Ÿ�� ���� �޼ҵ�
	void method2(String name, int age, String address) {
		Member m=new Member(name,age,address);
		System.out.println(m.name+","+m.age+","+m.address);
	}
	void method2_1(Member m) {
		System.out.println(m.name+","+m.age+","+m.address);
	}
	
	
  //�Ű����� �ȹް�, ����Ÿ�� �ִ� �޼ҵ�
	Member method3() {
		Member m=new Member("ȫ�浿",13,"�����");
		return m;
	}
	
  //�Ű����� �ȹް�, ����Ÿ�� ���� �޼ҵ�
  void method4() {
	  Member m=new Member("ȫ�浿",20,"������");
	  System.out.println(m.name+","+m.age+m.address);
  }
  
 public static void main(String[] args) {
	 MemberMethodsExample m1= new MemberMethodsExample();
	 //�Ű����� �ް�, ����Ÿ���ִ� �޼ҵ� ȣ��
	 Member m2=m1.method1("ȫ�浿", 20, "�����");
	 //�Ű����� �ް�, ����Ÿ�� ���� �޼ҵ� ȣ��
	 m1.method2("ȫ�浿", 20, "�����");
	 //�Ű����� ����, ����Ÿ�� �޴� �޼ҵ� ȣ��
	Member m3=m1.method3();
	 //�Ű����� ����, ����Ÿ�� ���� �޼ҵ� ȣ��
	 m1.method4();
}
}
