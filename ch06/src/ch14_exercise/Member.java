package ch14_exercise;

public class Member {
	//��ȣ �ڵ��߹��� static���� ����
	static int seq;//intŸ���� �⺻�� 0���� �ʱ�ȭ
	
	//non-static�ɹ�
	int sno;//0
	String name;//null
	String email;//null
	
	//(�⺻)������
	public Member(String name,String email) {
		sno=++seq;// ��ü �����ɶ����� �ν��Ͻ�����sno�� ������ seq���� ����
		this.name=name;
		this.email=email;		
	}
	
	//�ν��Ϻ� �����ϴ� �޼ҵ� non-static�޼ҵ�
	void info() {
		System.out.println("ȸ����ȣ:"
	      +this.sno+",�̸�:"
	      +this.name+",email:"+this.email);
	}
	
	//static�ɹ�
	static void total() {
		System.out.println("��ȸ����:"+seq);
	}
	
	
	
	
	
	

}
