package ch07.ch01;

public class A {
	//Parent field = new Parent();
	//����Ŭ����-������ �ٱ�Ŭ����$����.class
	Parent field = new Parent() {};
	void method() {
		field.chidleField=0;
		//field.newField=0;
	}
	//����Ŭ������ ������ ����� �ѰͰ� ����.
	//new Parent(){}�� ����� ��ü�� ��ӹ��� ��ü�� ������ ȿ���߻�
	//�ڽİ�ü�� �����Ͽ� �θ����������� ������ �Ͱ� ������ ���
	Parent field2=new Parent() {
		int newField;//�߰��� �ʵ�
		@Override
		void childMethod() {
	     System.out.println("�ڽĸ޼ҵ�");
		}
		void newMethod() {}//�߰��� �޼ҵ�
	};
    void method2() {
    	field2.childMethod();
    	field2.chidleField=0;
    	
    	//�ڽİ�ü���� �߰��� �޼ҵ�� �ν��ϹǷ� ���ٺҰ�
    	//field2.newField=0;
    	//field2.newMethod();//�߰��� �޼ҵ�� �ν��ϹǷ� ���ٺҰ�
    }
}

//�߻�Ŭ����
abstract class Parent{
	int chidleField;
	void childMethod() {}
}
//��Ӱ�ü
class Child extends Parent{
	int newField;//�߰��� �ʵ�
	@Override
	void childMethod() {
     System.out.println("�ڽĸ޼ҵ�");
	}
	void newMethod() {}//�߰��� �޼ҵ�
	
}