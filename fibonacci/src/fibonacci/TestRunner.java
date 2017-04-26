package fibonacci;

public class TestRunner {
	
	
	public static void main(String arg[]){
		int fibNum=100;
		Fibonacci fib = new Fibonacci(fibNum);
		System.out.println("The Fibonacci Numbers up to " + fibNum + " are: ");
		fib.populateFibArrayList(fibNum);
		System.out.println(fib.printFibArrayList());
		System.out.println(fib.printFibArrayListHorizontally());
	}
	
}
