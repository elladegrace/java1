package ch12;

import java.util.Scanner;

public class EnumUseExample3 {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("���̵� �Է��ϼ���>");
	 
	  String id=scanner.next();
	  //�޼��� ���(ǥ��ȭ)
	  if(id.equals("kim"))
		  System.out.println(LoginResult.LOGIN_SUCCESS);
	  else
		  System.out.println(LoginResult.LOGIN_FAILED);
	}
}
