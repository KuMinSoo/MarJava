package Array;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		int count=0;
		for(int i=0;i<words.length;i++) {
		char[] question = words[i].toCharArray(); // String char[] �� �� ��ȯ
	
		int ran=(int) (Math.random()*(words[i].length()));
		char tmp=' ';
		tmp=question[i];
		question[i]=question[ran];
		question[ran]=tmp;
		
		
		
		System.out.printf("Q%d. %s�� ������ �Է��ϼ��� .>", 
		i+1, new String(question));
		String answer = scanner.nextLine();
		// trim() answer , equals word[i] ���� �� �¿� ������ ������ �� �� �� ��
		
		if(words[i].equals(answer.trim())) {
			System.out.printf(" �¾ҽ��ϴ�.%n%n");	
			count++;
		}
		else
		System.out.printf(" Ʋ�Ƚ��ϴ�.%n%n"); 
		}

		System.out.println("��ü 4���� ��"+count+"������ ���߼̽��ϴ�.");

	}

}
