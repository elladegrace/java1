package ch09.ch04;

//���ʽ� ��� ���α׷�
public class EmployeeEX {
	public static void main(String[] args) {
		Employee[] emp=new Employee[6];
		emp[0]=new SalaryMan("�浿", 5000000);
		emp[1]=new SalaryMan("������", 200000);
		emp[2]=new SalaryMan("����", 80000000);
		emp[3]=new HourMan("����", 15, 9000);
		emp[4]=new HourMan("����", 20, 9000);
		emp[5]=new HourMan("����", 20, 9500);
		
		for(int i=0;i<emp.length;i++) {
			emp[i].computePay();
			emp[i].computeIncentive();
			emp[i].print();
		}
		
		

	}

}
