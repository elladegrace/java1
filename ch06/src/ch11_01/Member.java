package ch11_01;

public class Member {
	//�ʵ�
	String name;
	int age;
	String address;
	String email;
	String phone;
	
	//������
	public Member() {
	  this("ȸ����", 14, "�����");	
	};
	
	public Member(String name, int age, String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	//this(�Ű�����); ���� Ŭ�������� �ٸ� �����ڸ� ȣ���ϴ� �޼ҵ�
	//���� �ݵ�� ù��° �� ��ɹ����� ���;
	public Member(String name, int age, String address, String email) {
		this( name, age,  address);//�ݵ�� ù �ٿ� ǥ��
		this.email = email;
	}
	public Member(String name, int age, String address, String email, String phone) {
		this(name, age, address, email);//�ݵ�� ù�ٿ�
		this.phone = phone;
	}

}
