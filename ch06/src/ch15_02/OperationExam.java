package ch15_02;

import java.util.Scanner;

public class OperationExam {
  public static void main(String[] args) {
  //console�� ���� ���ڿ��� �Է¹޴� ��ü ����
  Scanner scanner = new Scanner(System.in);
  System.out.println("���� ���α׷��Դϴ�. �ΰ��� ���� �����ڸ� �Է��ϼ��� ��) 10 + 20");
  
  
  int num1 = scanner.nextInt();
  char op = scanner.next().charAt(0);
  int num2 = scanner.nextInt();
  
  switch(op) {
  case '+': System.out.println(num1 + num2); 
            break;
  case '-': System.out.println(num1 - num2);
            break;
  case 'x': System.out.println(num1 * num2);
            break;
  default: 	System.out.println(num1 / num2); 
            break;
  }
    //�ڿ�����
    scanner.close();

	}
}
