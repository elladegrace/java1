package ch03;

public class WrapperClassExample {

	public static void main(String[] args) {
	    //wrapperŬ���� ����
		Integer iValue=new Integer(10);//new Integer(����);
		Integer iValue2=new Integer("10");//new Integer("�������ڿ�");
		
		//IntegerŸ���� ���� StringŸ������ ��ȯ toString();
		String value=iValue.toString();//"10"
		
		System.out.println(value);
		
		//���ڿ� �� ������ ��ȯ valueOf("���ڿ� ��");
		iValue = Integer.valueOf("200");
         
 		System.out.println(iValue);
		System.out.println(iValue.intValue());
		
		//wrapperŬ���� �������� �⺻Ÿ�� int�� ��ȯ intValue();
		int i=iValue.intValue();
		
		//�⺻Ÿ�� int���� WrapperŬ������ ��ȯ new Integer(������);
		iValue = new Integer(i);
		

		
		

	}

}
