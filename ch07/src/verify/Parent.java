package verify;

public class Parent {
	public String name;
	//public Parent() {}
	public Parent(String name){
	   this.name=name;
	  }
}
//�ڽ�Ŭ�������� �Ű����� �����ڰ� �ִ���
//�θ�Ŭ������ �⺻�����ڰ� ������ ȣ���
//super()�� ����ϰų�
//�θ�Ŭ������ �⺻������ Parent()�� �߰��ϸ� ��.
class Child extends Parent{
   private int studentNo;
 public Child(String name, int studentNo){
	 super(name);
    this.name=name;
    this.studentNo=studentNo;
   }
 }