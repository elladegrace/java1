package ch05.generic;

import java.util.ArrayList;
import java.util.List;

public class MyGenericMainEx {

	public static void main(String[] args) {
		//������ <>�κп� ��ü Ŭ������ Ÿ�� ����
		//�����Ͻ� �ش�Ÿ������ ��ȯ 
	    MyClass<Integer> mc = new MyClass<Integer>();

	    MyClass<String> mc2 = new MyClass<String>();
	    
	    MyClass<Account> mc3 = new MyClass<Account>();
	    
	    List<Account> list = new ArrayList<Account>();
	}
}
class Account{}
/*
 //List��ü�� �޼ҵ尡 AccountŸ������ �����Ͻ� ��ȯ
 Account Account[] toArray(Account[] a);
 */
/*
public class MyClass<Account> {
	Account val;
	
	void set(Account a) {
		val=a;
	}
	
	Account get() {
		return val;
	}
} 

 */
/*
public class MyClass<Integer> {
	Integer val;
	
	void set(Integer a) {
		val=a;
	}
	
	Integer get() {
		return val;
	}
}
 */
/*
public class MyClass<String> {
String val;

void set(String a) {
	val=a;
}

String get() {
	return val;
 }
} 
*/