package ch01;

public class Student {
	//�Ӽ�(�ʵ�)
	int seq;//this.seq�� �� seq�ʵ带 ����Ŵ
	String name;
	int kor;
	
	//���(�޼ҵ�)
	void setSeq(int seq) {
		this.seq=seq;//this Ŭ������ ���� ������ ��ü �ڽ��� ����Ű�� Ű����
	}
	void setName(String name) {
		this.name=name;
	}
	void setKor(int kor) {
		this.kor=kor;
	}
	
	public String toString() {
		return seq+","+name+","+kor;
	}
}
