package fibonacci;

public class TestRunner {
	
	
	public static void main(String arg[]){
		int fibNum=100;
		System.out.println("The Fibonacci Numbers up to " + fibNum + " are: ");
		Fibonacci.printFibListOnTheFly(fibNum);
	}
}
