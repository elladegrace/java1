package verify.ch06;

public class Child extends Parent{

    private String name;
    public Child(){
    this("ȫ�浿");//Child(name) ȣ��//
    System.out.println("Child() call");//����4
   }
 
   public Child(String name){//����3
	   //super();//��������
   this.name=name;
   System.out.println("Child(String name) call");
   }

}