package OOP;
class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	public Student() {
		
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public void info() {
		System.out.printf("%s,%d,%d,%d,%d,%d,%g",name, ban, no, kor,eng,math,getAverage());
	}
	public int getTotal() {
		return kor+eng+math;
	}
	public float getAverage() {
		return Math.round(getTotal()/3.f*10)/10f;
	}
	
}
public class Ex2 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "È«±æµ¿"; 
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println(" ÀÌ¸§:"+s.name); 
		System.out.println("ÃÑÁ¡ :"+s.getTotal()); 
		System.out.println("Æò±Õ:"+s.getAverage()); 
		s.info();
	}

}
