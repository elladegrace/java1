package ch06;
//����� java Calc 10 - 20
public class Calc {
	//main�޼ҵ��� �Ű����� String[] args��
	//���̰� �������������� �迭, ����������Ϳ��� ����� �ƱԸ�Ʈ�Է��Ҷ� 
	//�迭�� �����Ǿ��� main() �޼ҵ�� ���޵�.
	// java Calc 10 + 20 
	public static void main(String[] args) {//["10"]["-"]["20"]
		if(args.length>=3) {
			switch(args[1]) {
			case "+": System.out.println(
					  Integer.parseInt(args[0])+Integer.parseInt(args[2]));
			          break;
			case "-":
				System.out.println(
						  Integer.parseInt(args[0])-Integer.parseInt(args[2]));
				break;
			case "x":
				System.out.println(
						  Integer.parseInt(args[0])*Integer.parseInt(args[2]));
				break;
			}
		}
		
	}

}
