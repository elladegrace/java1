package ch22;

public class AccountArrayExample {

	public static void main(String[] args) {
		int i=0;
		Account[] accountArray=new Account[10];
		accountArray[i++]=new Account("ȫ�浿", 1000); 
		accountArray[i++]=new Account("������", 5000); 
		accountArray[i++]=new Account("�Ӳ���", 6000); 
		accountArray[i++]=new Account("�̼���", 1000); 
		accountArray[i++]=new Account("������", 9000);
		
		
		//����Ÿ���� �迭������ ����ִ� ��Ҵ� null�� �ʱ�ȭ�Ǿ��ֱ⶧����
		//����index��Ұ��� null���� ���θ� Ȯ�� �ؾ���.
		for(int j=0;j<accountArray.length;j++) {
			if(accountArray[j] !=null)
			System.out.println(accountArray[j].getAccountNo()+","
		      +accountArray[j].getOwner()+","+accountArray[j].getBalance());
		}
		
		Account acc=null;
		//ȫ�浿�� ���� ���� �б�
		for(int k=0;k<accountArray.length;k++) {
			if(accountArray[k]!=null) {
				acc=accountArray[k];
				//��ü�� �ʵ尪���� ����θ� Ȯ��
				if(acc.getOwner().equals("ȫ�浿")) break;
			}
		}
    System.out.println(acc.getAccountNo()+","
		                 +acc.getOwner()+","+acc.getBalance());
		
		
		
	}

}
