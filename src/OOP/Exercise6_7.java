package OOP;

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public double getDistance(int a, int b) {
		
		return Math.sqrt(Math.pow(this.x-a,2)+Math.pow(this.y-b, 2));
	}
}

class Exercise6_7 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1, 1);
// p (2,2) . 와 의 거리를 구한다
		System.out.println(p.getDistance(2, 2));
	}
}
