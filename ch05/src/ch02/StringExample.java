package ch02;

public class StringExample {

	public static void main(String[] args) {
		String name1="�ſ��";
		String name2="�ſ��";
		String name3=new String("�ſ��");
		
		//������
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name3));
		
		//�����
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
	    System.out.println(name1.hashCode());
	    System.out.println(name3.hashCode());
		

	}

}
