package verify;

//�ִ밪 ���ϱ�
public class Exercise7_2{
	 public static void main(String[] args){

	 int min=100;

	int[] array={1,5,3,8,2};

	 //�ۼ� ��ġ
	 for(int i=0;i<array.length;i++) {
		//�ּҰ��̾��ϴ� ���� �迭�� ��Ұ����� ũ�� min�� ��Ұ��� �����Ͽ� min���� �۰� ����.
		 if(min > array[i]) min=array[i];
	 }

	 System.out.println("min: "+ min);
	}

	}
