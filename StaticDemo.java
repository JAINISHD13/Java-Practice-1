
/*
 *Static variable, methods doesn't need to create an instance for invoke. 
 */
public class StaticDemo {

	static int a = 5;
	
	static
	{
		System.out.println("Static block invoked");
	}
	
	static void method()
	{	
		System.out.println("Static method invoked");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b = 1;
		
		//Static methods and variable can be invoked without creating an object of a class
		method();
		
		System.out.println("Summation of a and b:"+(a + b));
		
		
	}

}
