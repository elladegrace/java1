package ch07.ch06.r;

import ch07.ch06.q.A;

public class B extends A{
	void sub() {
		pub=1;//public
		pro=2;//protected
		//def=3;//default
		//pri=4;//private���ٺҰ�
	}
}

class C{
	void sub() {
		A a=new A();
		a.pub=1;//public�� ���ٰ���
//		a.pro=2;//��Ӱ��谡 �ƴϸ� ���ٺҰ�
	}
}