package verify.ch05;

public class ActionExample {

	public static void main(String[] args) {
		Action actio =new A();
		Action action=new Action(){
			@Override
			public void work() {
				System.out.println("���縦 �մϴ�.");
			}};
		
		action.work();

	}

}
