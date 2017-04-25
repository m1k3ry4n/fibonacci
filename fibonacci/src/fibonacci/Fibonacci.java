package fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fibonacci {

	// Use a map so you don't recalculate every Fibonacci number more than once
	static Map<Integer,BigInteger> fibMap = new HashMap<>();

	static BigInteger getFibonacciNumber(int n){

		// 0	1	2	3	4	5	
		// 0	1	1	2	3	5	8	13	21	34	55	89	144	233	377	610	987	1597	2584	4181	6765

		if (fibMap.containsKey(n)){
			return fibMap.get(n);
		} else {
			if (n==0){
				fibMap.put(0, new BigInteger("0"));
				return fibMap.get(0);
			} else if (n==1){
				fibMap.put(1, new BigInteger("1"));
				return fibMap.get(1);
			}else{
				BigInteger fibNumber = getFibonacciNumber(n-2).add(getFibonacciNumber(n-1));
				fibMap.put(n, fibNumber);
				return fibMap.get(n);
			}
		}
	}

	static List<BigInteger> getFibonacciList(int n){

		List<BigInteger> fibList = new ArrayList<>();
		for(int i=0; i<=n; i++){
			fibList.add(getFibonacciNumber(i));
		}
		return fibList;
	}

	static String printFibList(int n) {
		int counter = 0;
		String fibListString = "";
		List<BigInteger> fibList = getFibonacciList(n);
		for(BigInteger fibNum: fibList){
			fibListString = fibListString + "[" + counter + "]" + " => " + fibNum + "\n";
			counter++;
		}
		return fibListString;
	}


	static void printFibListOnTheFly(int n){
		for(int i=0; i<=n; i++){
			System.out.println("["+i+"] " + getFibonacciNumber(i));
		}
	}

}
