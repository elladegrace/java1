package ch01;

public class StringExample {

	public static void main(String[] args) {
		//���ڿ������� ���ڿ� ������ ����
		String str1="abc";
		System.out.println(str1);
		
		//����Ÿ�� �迭 ���� = �ʱⰪ; 
		char data[] = {'a', 'b', 'c'};
		//����Ÿ�� �迭�� ���ڿ� �����ϴ� ��ɹ�
	     String str = new String(data);
	    //���ڿ� ��¹�
	    System.out.println(str); 
	    
	    //����Ÿ�Թ迭�� �� ��Ҹ� ����ϴ� �ݺ���
	    for(int i=0;i<data.length;i++) {
	    	System.out.println(data[i]);
	    }
	}
	
}
