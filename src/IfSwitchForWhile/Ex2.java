package IfSwitchForWhile;

public class Ex2 {

	public static void main(String[] args) {
		//4-6	
		for(int i=1;i<=6;i++) {
			for(int j=1; j<=6;j++) {
				if(i+j==6) {
					System.out.printf("[%d,%d]%n",i,j);
				}
			}
		}
		
		
		//4-7
		int value=(int)(Math.random()*6)+1;
		System.out.println("value: "+value);
		
		//4-9
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=10;j++) {
				if(2*i+4*j==10) {
					System.out.printf("x=%d, y=%d%n",i,j);
				}
			}
		}
		int i=0;
		while(i<=10) {
			int j=0;
			while(j<=10) {
				if(2*i+4*j==10) {
					System.out.printf("x=%d, y=%d%n",i,j);
				}
				j++;
			}
			i++;
		}
		
		
		//4-10
		String str="12345";
		int sum=0;
		for(i=0;i<str.length();i++) {
			sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		System.out.println("sum="+sum);
		
		i=0;
		sum=0;
		
		while(i<str.length()) {
			String chq=str.charAt(i)+"";
			sum+=Integer.parseInt(chq);
			i++;
		}
		System.out.println("sum="+sum);
		
				
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.print(num1+","+num2);
		int a=1,b=2;
		for (i = 0 ; i < 8 ; i++ ) {
			if(i==0) {
				num3=num1+num2;
			}else{
				num3=a*num1+b*num2;
				int tmp=0;
				tmp=a;
				a=b;
				b=a+tmp;
			}
			
			System.out.print(","+num3);
			
			
		}
		System.out.println();
		num1 = 1;
		num2 = 1;
		num3 = 0; // 세번째 값
		System.out.print(num1+","+num2);
		int tmp=0;
		for (i = 0 ; i < 8 ; i++ ) {
			
			num3=num1+num2;
			System.out.print(","+num3);
			num1=num2;
			num2=num3;
			
		}


		
		
		
		
		
		
	}

}
