package ch01;

public class StudentMainExample {
	public static void main(String[] args) {
		//����� �� ���� Ŭ������ �������� �������� ��ü�� �����Ҽ� ����.
		//Ŭ������ �Ӽ��� ǥ�õ�.
		//Student��ü ���� - ��ü�� �Ӽ��� ���� ������ �����.
		Student s1=new Student();//��ü ����: new Ŭ������();
		s1.setSeq(1);//��ü�� �����ϴ� �޼ҵ� ȣ��� �۾� ó��-ȣ��� �޼��� ����.
		s1.setName("ȫ�浿");
		s1.setKor(88);
		
		System.out.println(s1.toString());
		
		Student s2=new Student();//��ü ����: new Ŭ������();
		s2.setSeq(2);
		s2.setName("������");
		s2.setKor(90);
		
		Student s3=new Student();//��ü ����: new Ŭ������();
		s3.setKor(3); s3.setName("�Ӳ���"); s3.setKor(75);

	}

}
