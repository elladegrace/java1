package ch10;

public class AdvancedForExample5 {
	public static void main(String[] args) {
		String[] sArr = { "ȫ�浿", "������", "�Ӳ���" };

		for (int i = 0; i < sArr.length; i++)
			System.out.println(sArr[i]);

		// ���� for������ ����غ�����
		for (String s : sArr) {
			System.out.println(s);
		}
		
		//���� for�� ���� ����
		int[] intArr= {1,2,3,4,5,6,7};
		int sum=0;
		for(int i:intArr) {
			sum+=i;
		}
		System.out.println("�հ�:"+sum);
		
	}
}
