package ch22;

public class AccountMainExample {

	public static void main(String[] args) {
		Account account=new Account("ȫ�浿", 1000);
		System.out.println(account.getOwner()+","
		         + account.getAccountNo()+","+account.getBalance());
		
		//�Ա�
		account.deposit(5000);
		System.out.println(account.getOwner()+","
		         + account.getAccountNo()+","+account.getBalance());
		
		//���
		account.withdraw(9000);
		System.out.println(account.getOwner()+","
		         + account.getAccountNo()+","+account.getBalance());
		account.withdraw(3000);
		System.out.println(account.getOwner()+","
		         + account.getAccountNo()+","+account.getBalance());
		
		
		Account account2=new Account("������", 1000);
		
		System.out.println(account2.getOwner()+","
		         + account2.getAccountNo()+","+account2.getBalance());
		
		
		
		
	}

}
