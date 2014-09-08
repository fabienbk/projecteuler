package com.fbksoft.euler.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ? */
public class LargestPrimeFactor {

	public static ArrayList<Long> getFactors(Long n) {
		ArrayList<Long> result = new ArrayList<>();
		for(Long i = 2L; i < Math.sqrt(n); i++) {
			if (n%i==0) {
				result.add(i);
				result.add(n/i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		ArrayList<Long> factors = getFactors(600851475143L);
		Collections.sort(factors, new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				if (o2 < o1) {
					return -1;
				}
				else if (o2 == o1) {
					return 0;
				}
				return 1;
			}
		});
		for (Long factor : factors) {
			if (getFactors(factor).size() == 0) {
				System.out.println(factor);
				break;
			}
		}
	}
	
}
