package IfSwitchForWhile;

public class Ex6 {

	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result =0; // number ���� �� �Ųٷ� ��ȯ�ؼ� ���� ����
		while(tmp !=0) {
			StringBuilder sb=new StringBuilder(number+"");
			result=Integer.parseInt(sb.reverse()+"");
			break;
		}
		if(number == result)
		System.out.println( number + "�� ȸ���� �Դϴ� ."); 
		else
		System.out.println( number + "�� ȸ������ �ƴմϴ� .");

		
		number = 12321;
		tmp = number;
		result =0; // number ���� �� �Ųٷ� ��ȯ�ؼ� ���� ����
		StringBuffer sb=new StringBuffer();
		while(tmp !=0) {	
			sb.append(tmp%10+"");
			tmp/=10;
		}
		result=Integer.parseInt(sb+"");
		
		System.out.println(result);
		if(number == result)
		System.out.println( number + "�� ȸ���� �Դϴ� ."); 
		else
		System.out.println( number + "�� ȸ������ �ƴմϴ� .");

		
		
	}

}
