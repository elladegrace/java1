package verify;

public class Single {
  private static Single instance;
  //�����ڸ� �ܺο��� ȣ���Ҽ� ������ �����
  private Single() {}
  
public static Single getInstance() {
	if(instance==null) new Single();
	return instance;
}
  

}
