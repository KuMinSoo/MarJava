package Operator;

public class Exercise3_9 {

	public static void main(String[] args) {
		char ch = 'z';
		boolean b = (('a'<=ch && ch <= 'z') ||('A'<=ch && ch<='Z'))?true:false;
		System.out.println(b);

		char ch1 = 'A';
		char lowerCase = ch1>=65 && ch1 <='Z' ? (char)(ch1+32) : ch;
		System.out.println("ch:"+ch1);
		System.out.println("ch to lowerCase:"+lowerCase);
		
		//System.out.println(Integer.parseInt("100/10"));
		
		
	}

}
