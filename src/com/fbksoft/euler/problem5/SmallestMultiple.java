package com.fbksoft.euler.problem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fbksoft.euler.api.Tools;;


/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class SmallestMultiple {

	public static void main(String[] args) {
		System.out.println(2*3*2*5*7*2*3*11*13*2*17*19); // intuitive solution
		
		// general case solution:
		
		List<Long> factors = new ArrayList<>();
		Map<Long, Long> count = new HashMap<>();
		
		for(long i = 1; i <= 20; i++) {
			List<Long> decomposition = Tools.getPrimeDecomposition(i);
			Map<Long, Long> decompositionCount = new HashMap<>();
			
			for (Long prime : decomposition) {
				if (!decompositionCount.containsKey(prime)) {
					decompositionCount.put(prime, 1L);
				}
				else {
					decompositionCount.put(prime, decompositionCount.get(prime) + 1);
				}
			}
			
			for (Long prime : decompositionCount.keySet()) {
				if (!count.containsKey(prime)) {
					count.put(prime, decompositionCount.get(prime));
					for(int n=0;n < decompositionCount.get(prime); n++) {
						factors.add(prime);
					}
				}
				else if (count.get(prime) < decompositionCount.get(prime)) {
					long delta =  decompositionCount.get(prime) - count.get(prime);
					count.put(prime, decompositionCount.get(prime));
					for(int n=0;n < delta; n++) {
						factors.add(prime);
					}
				}
			}
		}
		
		
		System.out.println(factors);
		System.out.println(Tools.mapProduct(factors));
	}
	
}
