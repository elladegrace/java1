package ch04;

//ĸ��ȭ
public class Member {
	//�Ӽ�-�ܺ����ܵ� ����Ÿ private
	private int sno;//ȸ����ȣ
	private String name;//ȸ����
	private String jumin;//�ֹι�ȣ
	
	//���-�ܺο� ����� �޼ҵ�-public
	public void setSno(int sno) {this.sno = sno;}
	public void setName(String name) {this.name = name;}
	public void setJumin(String jumin){this.jumin = jumin;}

	//���-�ܺο� ����� �޼ҵ�-public
	public void getInfo(int grade) {
	   getGrade(grade);
	}
	
	//��ɺκ�-�ܺο� ���ܵ� �޼ҵ�-private
   private void getGrade(int grade) {
	   if(grade==1)System.out.println(sno+","+name+","+jumin); 
	   else
		   System.out.println(sno);
   }
    
}
