package ch12;

public class EnumUseExample {
	public static void main(String[] args) {
	 //�ۼ��� ����� ���� Ÿ�� ���� ����
	Week today;
	//����� ���� ������ ����� ���� ��(���ͷ�) ����;
	today=Week.TUE;
	
	System.out.println(today.ordinal());//index��ȣ ���
	System.out.println(today.name());//���Ż����ü���� ���ڿ��� ���
	
	Week[] arr=today.values();//����� ���� ��ü���� ���Ż������ �迭�� ���
	for(Week w:arr) {
		System.out.println(w);
	}
	//today �� ����
	today =Week.valueOf("SAT");//���ڿ����� ����Ÿ��(Week)���� ��ȯ�ϴ� �޼ҵ�
	
	System.out.println(today);
	
	Week day1=Week.MON;
	Week day2=Week.THU;
	
	//���ư�ü���� ���� ����� �������� ����ϴ� �Լ� compareTo()
	System.out.println(day1.compareTo(day2));
	System.out.println(day2.compareTo(day1));

	}
}
