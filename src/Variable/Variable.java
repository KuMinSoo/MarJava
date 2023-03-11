package Variable;

public class Variable {

	public static void main(String[] args) {
		int a=0xA;
		double b=0X1p1;
		System.out.println(a);
		
		// %b : boolean
		boolean bo=true;
		boolean bo1=false;
		System.out.printf("bo=%b%n",bo);
		System.out.printf("bo1=%b%n",bo1);
		
		// %c : 문자
		char ch='A';
		System.out.printf("ch=%c%n",ch);
		
		// %s : 문자열
		String str="abc";
		System.out.printf("str=%s%n",str);
		
		// %d : 10진수
		int num=100;
		System.out.printf("num=%d%n",num);
		
		// %o : 8진수
		int oct=016;
		System.out.printf("oct=%o%n",oct); // oct=16
		System.out.printf("oct=%#o%n",oct);// oct=016
		
		// %x or %X : 16진수
		int hex=0xAF;
		System.out.printf("hex=%x%n",hex); //hex=af (%x : 소문자로 표시)
		System.out.printf("hex=%X%n",hex); //hex=AF (%X : 대문자로 표시)
		System.out.printf("hex=%#X%n",hex);//hex=0XAF
		
		int binum=0b1;
		int bi2=0B1;
		int oc=0xFF;
		int ac=0Xaa;
		int as=041;
		
		String str11="abcdefg";
		double abc=1234.1223;
		
		System.out.printf("[%10s]%n",str11); // 10글자 채워서 오른쪽 정렬 나머지는 공백처리
		System.out.printf("[%-10s]%n",str11);// 10글자 채워서 왼쪽 정렬 나머지 공백처리
		System.out.printf("[%.4s]%n",str11);//왼쪽에서 4글자만 나옴
		System.out.printf("[%f]%n",abc);  // 소주점 6자리까지만 출력 없는 소수점 값은 0으로 처리함
		System.out.printf("[%g]%n",abc); // 간략하게 표현
		System.out.printf("[%e]%n",abc); // 지수로 표현
		System.out.printf("[%10.3f]%n",abc); // 총 10자리 그 중 소수점 3자리까지 표현
		System.out.printf("[%20.10f]%n",abc); // 총 15자리 중 소수점 10자리까지 표현 하고 없는 소수점 값은 0으로 채움/ 정수는 0으로 안채움
		System.out.printf("[%020.10f]%n",abc); // 총 15자리 중 소수점 10자리까지 표현 하고 없는 값은 0으로 채움 / 정수 0으로 채움
		
		String s=123+"";
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String ab= sb.toString();
		Long.parseLong(ab);
		
		
	}

}
