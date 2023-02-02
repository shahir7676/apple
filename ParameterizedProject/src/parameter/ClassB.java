package parameter;

public class ClassB {
		void addinteger(int x, int y) {
			int result= x+y;
			System.out.println("addition of two integer is " + result);
		}
		
		void subtractinteger(int a, int b) {
			int result= a-b;
			System.out.println("subtraction of two integer is " + result);
		}
		
		void multiplyinteger(int n, int m) {
			int result= n*m;
			System.out.println("multiplication of two integer is " + result);
		}
		
		void divideinteger(int k, int t) {
			int result= k/t;
			System.out.println("division of two integer is " + result);
		}
	
		void str(String x) {
			System.out.println("string is " + x);

		}
		
		void bool(boolean x) {
			System.out.println("boolean of two integer is " + x);
		}
		
		void doub(double x, double y) {
			System.out.println("double of two integer is " + (x/y));
		}
}
