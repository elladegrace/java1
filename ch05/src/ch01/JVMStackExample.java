package ch01;

public class JVMStackExample {
	public static void main(String[] args) {
		 char v1='A';//���� ���� push('A')
		 
		 //�������� ����� ������ �������� �����.
		 if(v1=='A') {//���� ����
			 int v2 = 100; //push('100')
			 double v3 = 3.14;//push('3.14)
		 }//pop(); pop();
		 
		 boolean v4 = true;//���� ���� //push(true)
	}//pop();pop();

}
