package ch09.ch04;

public class SalaryMan extends Employee {
	private int annualSal;//���� �ʵ�
	//������
	public SalaryMan(String name, int annualSal) {
		super(name);
		this.annualSal = annualSal;
	}
  
	//�޼ҵ� ������
	@Override
	int computePay() {
		sal=annualSal/12;
		return sal;
	}

}
