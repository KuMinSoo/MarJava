package IfSwitchForWhile;

public class Ex1 {

	public static void main(String[] args) {
		//1��
		int x=0;
		if(x>10 && x<20) {}
		//2��
		char ch=' ';
		if(!(ch==' '||ch=='\t'));
		//3��
		if(ch=='x'||ch=='X');
		//4��
		if('0'<=ch && ch <='9');
		//5��
		if(('a'<=ch && ch<='z')||('A'<=ch && ch <= 'Z'));
		//6��
		int year=0;
		if(!(year%400==0 || (year%4==0 && year%100==0))){}
		//7��
		boolean powerOn = false;
		if(!powerOn);
		//8��
		String str=null;
		if("yes".equals(str));
		
		//4-2
		int sum=0;
		for(int i=1;i<=20;i++) {
			if(!(i%2==0 || i%3==0)) continue;
			sum+=i;
		}
		System.out.println("����: "+sum);
		//while
		
		
		int i=0;
		sum=0;
		while(++i<=20) {
			if(!(i%2==0 || i%3==0)) {
				continue;
			}
			sum+=i;		
		}
		System.out.println("����: "+sum);
				
		//4-3
		sum=0;
		int totalSum=0;
		for(i=0;i<11;i++) {
			sum+=i;
			totalSum+=sum;
		}
		System.out.println("����: "+totalSum);
		i=0;
		sum=0;
		totalSum=0;
		while(i<11) {
			sum+=i;
			totalSum+=sum;
			i++;
		}
		System.out.println("����: "+totalSum);
		
		
		
		//4-4
		
		i=0;
		while(true) {
			i+=(i%2==0)?-i:i;
			if(i>=100) break;
			i++;
		}
		System.out.println("�����:"+ i);
		
		for(i=1;;i++) {
			i+=(i%2==0)?-i:i;
			if(i>=100) break;
			
		}
		System.out.println("�����:"+ i);
		i=0;
		
		while(i<10) {
			int j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
