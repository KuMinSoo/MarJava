package Operator;

public class Operator1 {

	public static void main(String[] args) {
		//산술변환: 연산 되기 직전에 자동항변환해주는 것
		//int = int + char -> int + int
		int abc='a'+1;
		
		//double= float + double -> double + double
		double acs= 2.2f+2.2;
		
		//float = long + float -> float  + float
		float $ed=100000000000L+12.3f;
		

		int a1=10/3;
		System.out.println("a1="+a1);
		
		float a2=10/3f;
		System.out.println("a2="+a2);
		
		int i=0;
		int j=i++; // i를 먼저 j에게 대입한 후 i를 1 증가  , j=0
		j=--i;// j에게 i를 대입하기 전에  i를 1 감소 시킴  , j=0
		
		
		char ch='c'+'b'+1;//문자 리터럴 + 정수 리터럴 연산하면 자동으로 char 형태로 항변환해준다.
		byte q1=11;
		byte q2=22;
		//byte ac=q1+q2; // 에러 발생 (int형 보다 범위가 작은 변수의 연산은 산술연산(자동형 변환)을 하기 때문임)
		
	
		//실수형 등가비교
		float b1=30.0f;
		double b2=30.0d;
		
		System.out.printf("b1=%19.17f%n",b1); // b1=30.00000000000000000
		System.out.printf("b2=%19.17f%n",b2); // b2=30.00000000000000000
		System.out.println("b1=b2: "+(b1==b2)); // true
		
		float b3= 33.3f;
		double b4= 33.3d;
		System.out.printf("b3=%19.17f%n",b3); //b3=33.29999923706055000
		System.out.printf("b4=%19.17f%n",b4); //b4=33.30000000000000000
		System.out.println("b3=b4: "+(b3==b4)); //false
		
		String ab1="abc";
		String ab2="abc";
		System.out.println("ab1==ab2: "+(ab1==ab2)); //ab1==ab2: true
		
		String ab3=new String("abc");
		String ab4=new String("abc");
		System.out.println("ab3==ab4: "+(ab3==ab4)); //ab3==ab4: false
		
		
		String ab5=new String("abc");
		String ab6=new String("abc");
		System.out.println("ab5==ab6: "+(ab5==ab6)); // ab5==ab6: false
		
		
		
		
		
	
	}

}
