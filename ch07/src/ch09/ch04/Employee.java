package ch09.ch04;

public abstract class Employee {
   private String name;
   int sal;
   private static final float INCENTIVE_RATE=0.1f;
   public Employee(String name) {	   this.name=name;   }
   //�߻�޼ҵ�-�޿� ���޼ҵ�
   abstract int computePay();
   //���ʽ� ��� �޼ҵ�
   final int computeIncentive() {
	   int pay=computePay();
	   int bonus=0;
	   if(pay>100000)
		   bonus=(int)(pay*INCENTIVE_RATE);
	  return bonus;
   }
   //���ʽ� ��� �޼ҵ�
   void print() {
	   System.out.println("=====================");
	   System.out.println("�̸�:"+name);
	   System.out.println("�޿�:"+sal);
	   System.out.println("���ʽ�:"+computeIncentive());
   }
}
