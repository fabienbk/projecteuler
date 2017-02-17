package problem7;

import com.fbksoft.euler.api.Tools;

public class The10001Prime {
	
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		int i = 1;
		long n = 1;
		while(i <= 10001) {
			if (Tools.isPrime(++n)) {
				i++;
			}
		}
		
		long t2 = System.currentTimeMillis();
		System.out.println(n + " found in " + (t2 - t1) + "ms");
	}
}
