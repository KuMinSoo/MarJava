package Regex;

import java.util.regex.Pattern;

public class Regex1 {

	public static void main(String[] args) {
		
		String regExp="(02|010)-\\d{3,4}-\\d{4}";//전화번호 정규식
		// 정규식 패턴, \d에서 \를 인식할 수 있도록 \ 하나 더 붙여줌--> \\d;
		String data="010-123-4567"; 
		boolean result=Pattern.matches(regExp, data);
		//Pattern 클래스의 matches(정규식패턴, 문자열)를 사용해서 패턴과 일치하면 true 아니면 false 출력함
		
		if(result) {
			System.out.println("정규식과 일치합니다");
		}else {
			System.out.println("정규식과 일치하지 않습니다");
		}
		
		regExp="\\w+@\\w+\\.\\w+(\\.\\w+)?";//이메일 정규식
		/*   \\w+@ 알파벳 대소문자 또는 숫자 또는 _ 중 1개 이상과 @ 포함
		 *   \\w+\\. 알파벳 대소문자 또는 숫자 또는 _ 중 1개 이상과 . 포함
		 *   \\w+ 알파벳 대소문자 또는 숫자 또는 _ 중 1개 이상
		 *   (\\.\\w+)? 그룹 1: \\.\\w+  .포함 알파벳 대소문자 또는 숫자 또는 _ 1개 이상을 포함한 그룹 1이 있거나 없거나  
		 *   
		 * */   
	 	data="asdf123@naver.com";
	 	result=Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다");
		}else {
			System.out.println("정규식과 일치하지 않습니다");
		}
		
		
		
	}

}
