package ch09;

import java.util.Arrays;

public class ArraysCopyExample2 {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		//intŸ���� �迭�� ���ο� �迭�� ������ ����
		int[] newArr=Arrays.copyOf(intArr, intArr.length);
		
		for(int i=0;i<newArr.length;i++)
			System.out.println(newArr[i]);
        
		// int[] ���ο� �迭��ü ������ ���� ���� 
		newArr[0]=9;
		
		System.out.println(intArr[0]);
		
		

	}

}
