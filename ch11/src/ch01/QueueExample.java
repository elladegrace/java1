package ch01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue que = new LinkedList();
		que.offer("ȫ�浿");
		que.offer("������");
		que.offer("ȫ�浿");
		que.offer("�Ӳ���");
	
		//���� ���� ����� ��ü �̱� poll();
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
	}
}
