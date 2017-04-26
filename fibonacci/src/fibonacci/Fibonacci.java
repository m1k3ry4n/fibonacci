package fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fibonacci {

	// Use a map so you don't recalculate every Fibonacci number more than once
	private List<BigInteger> fibArrayList;

	public Fibonacci(int n){
		fibArrayList = new ArrayList<>(n);
	}

	public BigInteger getFibonacciNumber(int n){

		// 0	1	2	3	4	5	
		// 0	1	1	2	3	5	8	13	21	34	55	89	144	233	377	610	987	1597	2584	4181	6765

		if (fibArrayList.get(n) == null){
			if (n==0){
				fibArrayList.add(0, new BigInteger("0"));
				return fibArrayList.get(0);
			} else if (n==1){
				fibArrayList.add(1, new BigInteger("1"));
				return fibArrayList.get(1);
			}else{
				BigInteger fibNumber = getFibonacciNumber(n-2).add(getFibonacciNumber(n-1));
				fibArrayList.add(n, fibNumber);
				return fibArrayList.get(n);
			}
		} else {
			return fibArrayList.get(n);
		}
	}

	public void populateFibArrayList(int n){

		int index = 0;

		while (index <= n){
			if (index==0){
				fibArrayList.add(0, new BigInteger("0"));
			} else if (index==1){
				fibArrayList.add(1, new BigInteger("1"));
			}else{
				BigInteger fibNumber = fibArrayList.get(index-2).add(fibArrayList.get(index-1));
				fibArrayList.add(index, fibNumber);
			}
			index++;
		}
	}

	public List<BigInteger> getFibonacciList(int n){

		List<BigInteger> fibList = new ArrayList<>();
		for(int i=0; i<=n; i++){
			fibList.add(getFibonacciNumber(i));
		}
		return fibList;
	}

	public String printFibArrayList() {
		int counter = 0;
		String fibListString = "";
		for(BigInteger fibNum: fibArrayList){
			fibListString = fibListString + "[" + counter + "]" + " => " + fibNum + "\n";
			counter++;
		}
		return fibListString;
	}
	
	public String printFibArrayListHorizontally(){
		int counter = 0;
		String fibListIndexes = "";
		String fibListNumbers = "";
		for(BigInteger fibNum: fibArrayList){
			fibListIndexes = fibListIndexes + "[" + counter + "]";
			fibListNumbers = fibListNumbers + fibNum + " ";
			counter++;
		}
		return fibListIndexes + "\n" + fibListNumbers;
	}

	public void printFibListOnTheFly(int n){
		for(int i=0; i<=n; i++){
			System.out.println("["+i+"] " + getFibonacciNumber(i));
		}
	}
}