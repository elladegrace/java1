package ch01;

public class ClassJVMExample {
	//��Ÿ�� ��� "hello"
	//�ʵ� msg1, msg2
    static String msg1 = "hello";
    String msg2 = "hello";
    //�ʵ� age
    int age=10;
    
    //�޼ҵ�
    public void method() {
    	//�޼ҵ� ������-local ����
    	double d=10.2;
    	System.out.println("hi");
    }
    //�⺻ ������ �ڵ�
    ClassJVMExample(){
    	System.out.println("�⺻ ������ ����");
    }
      //main()�޼ҵ�� ClassJVMExample��ü ������ ���� ������ �����ڵ�
	public static void main(String[] args) {
        new ClassJVMExample();
	}
}
