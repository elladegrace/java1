package ch02;

public class NullExample {
	public static void main(String[] args) {
		String refVar1=new String("hello");
		String refVar2=null;//�ʱⰪ  null
		
		refVar2=refVar1;//refVar2��  null-> refVar1�� �ּҰ��� ����
		
		if(refVar1==refVar2)System.out.println("���ϰ�ü�� ������");
		else System.out.println("�ٸ� ��ü�� ������");
		
		if(refVar1.equals(refVar2)) System.out.println("������ ����");
		else System.out.println("������ �ٸ�");
		
		System.out.println(refVar2.length());
		
		//refVar2�� "hello"��ü�� ������ ��������, "hi"��ü�� ������.
		refVar2=new String("hi");
		System.out.println(refVar2);
		System.out.println(refVar2.length());
		
		//refVar2�� "hi"��ü�� ������ ������
		//�����ϴ� ��ü���� ������ �������� �� 
		//������ �з��� NullPointException�� �߻���.
		refVar2=null;//�����ϴ� ��ü���� ������ ������ ���� �� null���.
		System.out.println(refVar2);
		System.out.println(refVar2.length());//�����߻�
	    
		

	}

}
