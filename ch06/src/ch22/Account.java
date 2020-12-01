package ch22;

public class Account {
    static int seq=0;
	//�ʵ�
	private String accountNo;
	private String owner;
	private int balance;
	
	//��������� ������ - default�����ڴ� ����.
	public Account(String owner, int balance) {
		this.accountNo = "001-20001-"+ ++seq;
		this.owner = owner;
		this.balance = balance;
	}

	//get�޼ҵ�/set�޼ҵ�
	public String getAccountNo() {		return accountNo;	}
	public String getOwner() {		return owner;	}
	public int getBalance() {		return balance;	}
		
	//�Ա�
	void withdraw(int amount) {
	  if(this.balance<amount) {
		  return;
	  }else {
		  this.balance = this.balance - amount;
	  }
	}
	
	//���
	void deposit(int amount) {
		 this.balance=this.balance+amount;
	}
	
	
	
	

}
