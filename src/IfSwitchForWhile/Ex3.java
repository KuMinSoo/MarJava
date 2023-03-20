package IfSwitchForWhile;

public class Ex3 {

	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			int k=1;
			for(int j=1;j<=3;j++) {
				System.out.printf("%d*%d=%d\t",(j+k),j,(j+k)*j);
				k++;
			}
			System.out.println();
		}
		System.out.println();

	}

}
