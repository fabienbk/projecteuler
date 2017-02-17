package com.fbksoft.euler.api;

public abstract class EulerProblem {

	public abstract <S> S getSolution();

	public void execute() {
		long t1 = System.currentTimeMillis();
		String solution = getSolution().toString();
		long t2 = System.currentTimeMillis();
		System.out.println("Solution = " + solution + " . solved in " + (t2-t1) + " ms");
	}
	
}
