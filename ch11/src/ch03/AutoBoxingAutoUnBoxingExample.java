package ch03;
//java 1.5 ���� �߰� -autoBoxing,autoUnBoxing
public class AutoBoxingAutoUnBoxingExample {
	public static void main(String[] args) {
	  // WrapperŸ�Կ� �⺻Ÿ���� �ٷ� ����
	  // AutoBoxing
      Integer iValue = 10;
      
      //�⺻Ÿ�� ->��üŸ�� 
      Byte b = 10;
      Short s=10;
      Long l=10l;
      Float f=10.0f;
      Double d=10.0;
      Boolean bool=true;
      
      //WrapperŸ���� �⺻Ÿ������ �ٷ� ��ȯ
      //AutoUnBoxing
      int i = iValue;
	  byte b1=b;
	  short s1=s;
	  long l1=l;
	  float f1=f;
	  double d1=d;
	  boolean bool1=bool;
	  
	  
		

	}

}
