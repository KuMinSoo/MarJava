package Variable;

public class Ex1 {

	public static void main(String[] args) {

		String str=1231376+"";
		char ch[]=str.toCharArray();
		int ab=ch[1];
		for(int i=0;i<ch.length-1;i++) {
			for(int j=ch.length-1;j>i;j--) {
				if(ch[i]<ch[j]) {
					char tmp1=ch[i];
					ch[i]=ch[j];
					ch[j]=tmp1;
				}
			}
			 
			
		}
        long answer = Long.parseLong(new String(ch));
  System.out.println(answer);
		
	}

}
