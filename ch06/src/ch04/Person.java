package ch04;

public class Person {
  private String name;
  private int age;
  
  public void setName(String name) {
	  this.name=name;
  }
  
  public void setAge(int age) {
	  if(age<0) {
		  System.out.println("����� ���̴� �ڿ��������մϴ�.");
	      return;//���̻� �������� ���� ȣ���� ������ �ǵ��ư���� ��ɾ�.
	  }
	  this.age=age;
  }
  
  public String toString() {
	  return name+","+age;
  }
  
	

}
