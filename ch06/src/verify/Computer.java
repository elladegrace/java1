package verify;

public class Computer {
	
	int sum1(int[] values) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
 //�Ű������� �Ѿ���� ���� ������ �𸦶� 
 // �Ű����� Ÿ�� ���� (Ÿ�� ... ����)
 // �Ѿ���� �Ű����� Ÿ��[] ���� ������ �迭�� �Ѿ��.
	int sum2(int ... values) {
		int sum=0;
		for(int i=0;i<values.length;i++)
			 sum+=values[i];
		return sum;
	}
	
	/*
	 * int sum2(int values) { int sum=0; for(int i=0;i<values.length;i++)
	 * sum+=values[i]; return sum; }
	 * 
	 * int sum2(int a1,int a2, int a3, int a4, int a5, int a6) { int sum=0; for(int
	 * i=0;i<values.length;i++) sum+=values[i]; return sum; }
	 */
	
}
