package Array;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		// ballArr . �迭 �� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�
		for(int i=0; i< ballArr.length;i++) {
		int j = (int)(Math.random() * ballArr.length);
		int tmp = 0;
		tmp=ballArr[i];
		ballArr[i]=ballArr[j];
		ballArr[j]=tmp;
		
		}
		// ballArr 3 ball3 . �迭 �� �տ��� ���� ���� �迭 �� �����Ѵ�
		ball3=Arrays.copyOf(ballArr, 3);
		for(int i=0;i<ball3.length;i++) {
		System.out.print(ball3[i]);
		}
		
		
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			int a=money/coinUnit[i];
			money%=coinUnit[i];
			System.out.printf("%d��: %d%n",coinUnit[i],a);
		}

		
		
		
		
		
		
	}

}
