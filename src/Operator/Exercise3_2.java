package Operator;

class Exercise3_2 {
public static void main(String[] args) {
	int numOfApples = 123; // ����� ����
	int sizeOfBucket = 10; // ( ) �ٱ����� ũ�� �ٱ��Ͽ� ���� �� �ִ� ����� ����
	int numOfBucket = (numOfApples+9)/sizeOfBucket; // ��� ����� ��µ� �ʿ��� �ٱ����� ��
	System.out.println("�ʿ��� �ٱ��� �� :"+numOfBucket); // �ʿ��� �ٱ����� ��
	

	int num = 10;
	System.out.println(num>0?"���":(num==0?0:"����"));

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
