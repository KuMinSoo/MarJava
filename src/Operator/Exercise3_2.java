package Operator;

class Exercise3_2 {
public static void main(String[] args) {
	int numOfApples = 123; // 사과의 개수
	int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
	int numOfBucket = (numOfApples+9)/sizeOfBucket; // 모든 사과를 담는데 필요한 바구니의 수
	System.out.println("필요한 바구니 수 :"+numOfBucket); // 필요한 바구니의 수
	

	int num = 10;
	System.out.println(num>0?"양수":(num==0?0:"음수"));

	int num1 = 456;
	System.out.println(num1/100*100);
	
	
	int num2 = 333;
	System.out.println(num2/10*10+1);

	
	int fahrenheit = 100;
	float celcius = (int)((fahrenheit-32)*5/9f*100+0.5)/100f;
	System.out.println("Fahrenheit:"+fahrenheit);
	System.out.println("Celcius:"+celcius);
 
	}
}
