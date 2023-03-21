package IfSwitchForWhile;

public class Ex3 {

	public static void main(String[] args) {
	
	for(int k=0;k<7;k+=3) {	
		for(int i=1;i<=3;i++) {
			for(int j=2;j<5;j++) {
				if(j+k==10) continue;
				System.out.printf("%d*%d=%d\t",j+k,i,(j+k)*i);
			}
			System.out.println();
		}
		System.out.println();
	}
		
		
		
		
		
	}

}
