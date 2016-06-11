package com.lambdaexpressions;

interface Calc {
	int add(int n1, int n2);
}

public class WorkingWithLambda {

	public static void main(String[] args) {
		Calc calc = (n1,n2) -> { return (n1+n2); };
		System.out.println("Result -> "+calc.add(1, 2));
	}
}