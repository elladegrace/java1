package ch03;

public class Member {
	//�Ӽ�
	int sno;//ȸ����ȣ
	String name;//ȸ����
	String jumin;//�ֹι�ȣ
	
	//���
	void getInfo(int grade) {
	   getGrade(grade);
	}
	
	//��ɺκ�
   void getGrade(int grade) {
	   if(grade==1)System.out.println(sno+","+name+","+jumin); 
	   else
		   System.out.println(sno);
   }
    
}
