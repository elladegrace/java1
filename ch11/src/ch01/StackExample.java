package ch01;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack stack=new Stack();
		
		stack.push("ȫ�浿");
		stack.push("������");
		stack.push("ȫ�浿");
		stack.push("�Ӳ���");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
