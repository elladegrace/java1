package ch04;

public class AMain {

	public static void main(String[] args) {
	  Member m1 = new Member();
	  //Member��ü�� �ʵ忡 �������ٺҰ�
	  //m1.sno=1;
	  //m1.name="ȫ�浿";
	  //m1.jumin="200101-1001111";
	  m1.setSno(1);
	  m1.setName("ȫ�浿");
	  m1.setJumin("200101-1001111");
	  
	  m1.getInfo(2);
	  //m1.getGrade(1);//�������� �Ұ�
	  
	  //m1.jumin="200101-2001111";
	  

	}

}
