package verify.ch06;

public class Parent{

    public String nation;

    public Parent(){
    this("���ѹα�");//Parent(nation)�� ���� ȣ����
      System.out.println("Parent() call");//����2
    }

 
   public Parent(String nation){
   this.nation=nation;
   System.out.println("Parent(String nation) call");//����1

   }

}