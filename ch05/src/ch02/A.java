package ch02;

public class A/* extends Object */{
  int i=0;

@Override//�θ�Ŭ������ �޼ҵ带 ������(�ڽ�Ŭ������ �°� ����)
public boolean equals(Object obj) {
	return i==((A)obj).i;
}
 
  
  
}
