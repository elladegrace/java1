package ch07.ch02;

public class MainExam {
	public static void main(String[] args) {
		Button button =new Button();
		
		button.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("��ȭ�� �̴ϴ�.");
			}
		});
		button.touch();
		
		button.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
			 System.out.println("�޼����� �����ϴ�.");
			}
		});
		
		button.touch();
		
	}

}
