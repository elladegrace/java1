package ch18.ch02.ch02;

//import java.util.Date;

import ch18.ch02.ch01.A;
import ch18.ch02.ch01.B;
//import ch18.ch02.ch01.C;

public class D {
	A a=new A();
	B b=new B();
	//�Ʒ��� ���� ��밡�������� �������� ������
    ch18.ch02.ch01.C c=new ch18.ch02.ch01.C();	
    
    void method() {
     //������ ��Ȳ- ���� sql�� DateŸ�� �������� util�� DateŸ������ Date����
     java.sql.Date now=
    		    new java.sql.Date(new java.util.Date().getTime());
     System.out.println(now);
    }
    
    public static void main(String[] args) {
		D d=new D();
		d.method();
	}
}
