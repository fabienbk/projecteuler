package problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

import com.fbksoft.euler.api.Tools;

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ? */
public class LargestPrimeFactor {

	public static void main(String[] args) {
		Set<Long> factors = Tools.getFactors(600851475143L);
		ArrayList<Long> factorList = new ArrayList<>(factors);
		Collections.sort(factorList, new Comparator<Long>() {
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
		for (Long factor : factorList) {
			if (Tools.getFactors(factor).size() == 0) {
				System.out.println(factor);
				break;
			}
		}
	}
	
}
