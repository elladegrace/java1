package ch07;

public class A {
	//Parent field = new Parent();
	Parent field = new Child();
	void method() {
     field.chidleField=0;
     //field.newField=10;//�ڽ�Ŭ�������� �߰��� �ɹ� ���ٺҰ�
     //field.newMethod();//�ڽ�Ŭ�������� �߰��� �ɹ� ���ٺҰ�
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