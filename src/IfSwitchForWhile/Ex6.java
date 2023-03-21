package IfSwitchForWhile;

public class Ex6 {

	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result =0; // number 변수 를 거꾸로 변환해서 담을 변수
		while(tmp !=0) {
			StringBuilder sb=new StringBuilder(number+"");
			result=Integer.parseInt(sb.reverse()+"");
			break;
		}
		if(number == result)
		System.out.println( number + "는 회문수 입니다 ."); 
		else
		System.out.println( number + "는 회문수가 아닙니다 .");

		
		number = 12321;
		tmp = number;
		result =0; // number 변수 를 거꾸로 변환해서 담을 변수
		StringBuffer sb=new StringBuffer();
		while(tmp !=0) {	
			sb.append(tmp%10+"");
			tmp/=10;
		}
		result=Integer.parseInt(sb+"");
		
		System.out.println(result);
		if(number == result)
		System.out.println( number + "는 회문수 입니다 ."); 
		else
		System.out.println( number + "는 회문수가 아닙니다 .");

		
		
	}

}
