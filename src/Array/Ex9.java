package Array;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		int count=0;
		for(int i=0;i<words.length;i++) {
		char[] question = words[i].toCharArray(); // String char[] 을 로 변환
	
		int ran=(int) (Math.random()*(words[i].length()));
		char tmp=' ';
		tmp=question[i];
		question[i]=question[ran];
		question[ran]=tmp;
		
		
		
		System.out.printf("Q%d. %s의 정답을 입력하세요 .>", 
		i+1, new String(question));
		String answer = scanner.nextLine();
		// trim() answer , equals word[i] 으로 의 좌우 공백을 제거한 후 로 와 비교
		
		if(words[i].equals(answer.trim())) {
			System.out.printf(" 맞았습니다.%n%n");	
			count++;
		}
		else
		System.out.printf(" 틀렸습니다.%n%n"); 
		}

		System.out.println("전체 4문제 중"+count+"문제를 맞추셨습니다.");

	}

}
