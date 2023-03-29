package OOP;




class SutdaCard{
	private int num;
	private boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
				
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if(num >= 1 && num <= 9) {
			this.num=num;
		}else {
			return;
		}
	
	}
	public boolean getIsKwang() {
		
		return isKwang;
	}
	public void setIsKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
	public String info() {
		
		if(isKwang==true) {
			return this.num+"K";
		}else {
			return num+"";
		}
		
		
	}
	
}


public class Ex1 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
		
		
	}

}
