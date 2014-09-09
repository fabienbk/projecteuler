package com.fbksoft.euler.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tools {

	public static Set<Long> getFactors(Long n) {
		HashSet<Long> result = new HashSet<>();
		for(Long i = 2L; i <= Math.sqrt(n); i++) {
			if (n%i==0) {
				result.add(i);
				result.add(n/i);
			}
		}
		return result;
	}
	
	public static boolean isPrime(Long n) {
		for(Long i = 2L; i <= Math.sqrt(n); i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static List<Long> getPrimeDecomposition(long i) {
		ArrayList<Long> decomposition = new ArrayList<>();
		getPrimeDecomposition(i, decomposition);
		return decomposition;
	}

	private static void getPrimeDecomposition(Long n, ArrayList<Long> decomposition) {
		boolean foundFactor = false;
		for(Long i = 2L; i <= Math.sqrt(n); i++) {
			if (n%i==0) {		
				foundFactor = true;
				decomposition.add(i);
				getPrimeDecomposition(n/i, decomposition);
				break;
			}
		}
		if (!foundFactor) {
			decomposition.add(n);
		}
	}


	public static void main(String[] args) {
		System.out.println(getPrimeDecomposition(234L));
	}


	public static Long mapProduct(List<Long> factors) {
		Long product = 1L;
		for (Long long1 : factors) {
			product *= long1;
		}
		return product;
	}
}
