package fibonacci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fibonacci {
	
	static Integer getFibonacciNumber(int n){
		
		// 0	1	2	3	4	5	
		// 0	1	1	2	3	5	8	13	21	34	55	89	144	233	377	610	987	1597	2584	4181	6765
		
		if (n==0){
			return 0;
		} else if (n==1){
			return 1;
		}else{
			return getFibonacciNumber(n-1) + getFibonacciNumber(n-2);
		}
	}
	
	static List<Integer> getFibonacciList(int n){
		
		List<Integer> fibList = new ArrayList<>();
		for(int i=0; i<=n; i++){
			fibList.add(getFibonacciNumber(i));
		}
		return fibList;
	}
	
	static String printFibList(int n) {
		int counter = 0;
		String fibListString = "";
		List<Integer> fibList = getFibonacciList(n);
		for(Integer fibNum: fibList){
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
