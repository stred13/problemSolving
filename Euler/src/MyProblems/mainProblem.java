package MyProblems;

import java.util.*;

import p1_25.problem_1;
import p1_25.problem_2;

public class mainProblem {

	public static void main(String[] args) {
		List<Integer> listFibonacci = problem_2.fibonacciSequnceBelow(4000000);
		listFibonacci.forEach(item -> System.out.print(item +" "));
		int sumFiboEven = problem_2.fiboEvenValueSum(listFibonacci);
		System.out.println("\n"+sumFiboEven);
	}

}
