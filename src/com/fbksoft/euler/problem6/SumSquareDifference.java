package com.fbksoft.euler.problem6;

/*
 * The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference {

	public static void main(String[] args) {
		
		int n = 100;
		// This one is purely solved mathemetically, by developping the formulas. Doing it with bruteforce is too boring.
		
		int result = (int)(3*Math.pow(n, 4) + 2*Math.pow(n, 3) - 3*Math.pow(n, 2) - 2*n) / 12;
		System.out.println(result);		
		
	
		
	}
	
}
