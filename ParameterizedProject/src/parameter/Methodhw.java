package parameter;

public class Methodhw {
	void method1(int x, String s, boolean b, double d) {
		System.out.println(" int "+ (x+5));
		System.out.println(" String "+ s);
		System.out.println(" boolean "+ b);
		System.out.println(" double "+ (d/x));	
	}
	void callingMethodhw (Methodhw z) {
		z.method1(5,"peanuts", 4>2, 3.1415);
	
	}
	public static void main(String[] args) {
		Methodhw a =new Methodhw();
		a.method1(4, "Hello", (4>2 & 4>2) & 3>6, 2.75);
		a.callingMethodhw(new Methodhw());
	}
}
	