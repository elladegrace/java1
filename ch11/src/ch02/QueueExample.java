package ch02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue que = new LinkedList();
		que.offer(new Integer(10));
		que.offer(10.0);//autoBoxing
		que.offer(new Float(10.5));
		que.offer(true);//autoBoxing
	
		//���� ���� ����� ��ü �̱� poll();
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
	}
}
