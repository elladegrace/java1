package ch09.ch04;

public class HourMan extends Employee{
	//�ٹ��ð�, �ñ�
	int workHour, moneyPerHour;

	public HourMan(String name, int workHour, int moneyPerHour) {
		super(name);
		this.workHour = workHour;
		this.moneyPerHour = moneyPerHour;
	}

	//�޼ҵ� ������
	@Override
	int computePay() {
		sal=workHour*moneyPerHour;
		return sal;
	}
	
	

}
