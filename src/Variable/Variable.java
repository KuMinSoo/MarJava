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
		
		// %c : ����
		char ch='A';
		System.out.printf("ch=%c%n",ch);
		
		// %s : ���ڿ�
		String str="abc";
		System.out.printf("str=%s%n",str);
		
		// %d : 10����
		int num=100;
		System.out.printf("num=%d%n",num);
		
		// %o : 8����
		int oct=016;
		System.out.printf("oct=%o%n",oct); // oct=16
		System.out.printf("oct=%#o%n",oct);// oct=016
		
		// %x or %X : 16����
		int hex=0xAF;
		System.out.printf("hex=%x%n",hex); //hex=af (%x : �ҹ��ڷ� ǥ��)
		System.out.printf("hex=%X%n",hex); //hex=AF (%X : �빮�ڷ� ǥ��)
		System.out.printf("hex=%#X%n",hex);//hex=0XAF
		
		int binum=0b1;
		int bi2=0B1;
		int oc=0xFF;
		int ac=0Xaa;
		int as=041;
		
		String str11="abcdefg";
		double abc=1234.1223;
		
		System.out.printf("[%10s]%n",str11); // 10���� ä���� ������ ���� �������� ����ó��
		System.out.printf("[%-10s]%n",str11);// 10���� ä���� ���� ���� ������ ����ó��
		System.out.printf("[%.4s]%n",str11);//���ʿ��� 4���ڸ� ����
		System.out.printf("[%f]%n",abc);  // ������ 6�ڸ������� ��� ���� �Ҽ��� ���� 0���� ó����
		System.out.printf("[%g]%n",abc); // �����ϰ� ǥ��
		System.out.printf("[%e]%n",abc); // ������ ǥ��
		System.out.printf("[%10.3f]%n",abc); // �� 10�ڸ� �� �� �Ҽ��� 3�ڸ����� ǥ��
		System.out.printf("[%20.10f]%n",abc); // �� 15�ڸ� �� �Ҽ��� 10�ڸ����� ǥ�� �ϰ� ���� �Ҽ��� ���� 0���� ä��/ ������ 0���� ��ä��
		System.out.printf("[%020.10f]%n",abc); // �� 15�ڸ� �� �Ҽ��� 10�ڸ����� ǥ�� �ϰ� ���� ���� 0���� ä�� / ���� 0���� ä��
		
		String s=123+"";
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String ab= sb.toString();
		Long.parseLong(ab);
		
		
	}

}
