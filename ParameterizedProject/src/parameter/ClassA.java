package parameter;

public class ClassA {

	public static void main(String[] args) {
		ClassB a = new ClassB();
		a.addinteger (5,10);
		a.subtractinteger (7,3);
		a.multiplyinteger(2,4);
		a.divideinteger(15,3);
		a.str("abcd1234");
		a.bool(10>4);
		a.doub(12,7); 
		
		ClassC b= new ClassC();
		b.myMethod3("Shahir's",21);
		b.myMethod2("Shahir",'s');
		b.doub(4, 3.1415);
	}
	
	}
