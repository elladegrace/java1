package ch17;

public class PersonMainExample {
	public static void main(String[] args) {
      Person p1 = new Person("20010101-1100012", "ȫ�浿");
      Person p2 = new Person("20010202-2100013", "������");
      
      //��� �̹Ƿ� �����Ұ�
      //p1.nation="usa";
      
      System.out.println(p1.nation+","+p1.ssn+","+p1.name);
      System.out.println(p2.nation+","+p2.ssn+","+p2.name);
      

	}

}
