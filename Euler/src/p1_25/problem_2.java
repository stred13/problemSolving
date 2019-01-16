package p1_25;

import java.util.*;

public class problem_2 {
	
	public static List<Integer> fibonacciSequnceBelow(int topNumber){
		List<Integer> listFibonacci = new ArrayList<>();
		listFibonacci.add(1);
		listFibonacci.add(2);
		int penultimate = 1; 
		int last = 2; 
		while(penultimate+last<topNumber) {
			listFibonacci.add(penultimate+last);
			penultimate = listFibonacci.get(listFibonacci.size()-1);
			last = listFibonacci.get(listFibonacci.size()-2);
		}
		return listFibonacci;
	}
	
	public static int fiboEvenValueSum(List<Integer> listFibonacci) {
		int sumEvenFibo =0;
		
		for (Integer number : listFibonacci) {
			if(number%2==0)
				sumEvenFibo+=number;
		}
		
		return sumEvenFibo;
	}
}
