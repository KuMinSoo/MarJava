package Regex;

import java.util.regex.Pattern;

public class Regex1 {

	public static void main(String[] args) {
		
		String regExp="(02|010)-\\d{3,4}-\\d{4}";//��ȭ��ȣ ���Խ�
		// ���Խ� ����, \d���� \�� �ν��� �� �ֵ��� \ �ϳ� �� �ٿ���--> \\d;
		String data="010-123-4567"; 
		boolean result=Pattern.matches(regExp, data);
		//Pattern Ŭ������ matches(���Խ�����, ���ڿ�)�� ����ؼ� ���ϰ� ��ġ�ϸ� true �ƴϸ� false �����
		
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�");
		}
		
		regExp="\\w+@\\w+\\.\\w+(\\.\\w+)?";//�̸��� ���Խ�
		/*   \\w+@ ���ĺ� ��ҹ��� �Ǵ� ���� �Ǵ� _ �� 1�� �̻�� @ ����
		 *   \\w+\\. ���ĺ� ��ҹ��� �Ǵ� ���� �Ǵ� _ �� 1�� �̻�� . ����
		 *   \\w+ ���ĺ� ��ҹ��� �Ǵ� ���� �Ǵ� _ �� 1�� �̻�
		 *   (\\.\\w+)? �׷� 1: \\.\\w+  .���� ���ĺ� ��ҹ��� �Ǵ� ���� �Ǵ� _ 1�� �̻��� ������ �׷� 1�� �ְų� ���ų�  
		 *   
		 * */   
	 	data="asdf123@naver.com";
	 	result=Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�");
		}
		
		
		
	}

}
