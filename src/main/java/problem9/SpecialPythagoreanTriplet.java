package problem9;

import com.fbksoft.euler.api.EulerProblem;

public class SpecialPythagoreanTriplet extends EulerProblem {
	/*
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
	 * which,
	 * 
	 * a2 + b2 = c2 For example, 32 + 42 = 9 + 16 = 25 = 52.
	 * 
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 */

	@Override
	public Integer getSolution() {

		for (int a = 1; a < 1000; a++) {
			for (int b = a; b < 1000; b++) {
				if (Math.sqrt(a * a + b * b) == (1000 - a - b)) {
					System.out.println("a b = " + a + " " + b);
					return a * b * (1000 - a - b);
				}
			}
		}
		throw new RuntimeException("not found");
	}

	public static void main(String[] args) {
		new SpecialPythagoreanTriplet().execute();

	}

}
