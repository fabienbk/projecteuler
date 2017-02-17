package problem4;

/*
 * Largest palindrome product
 * 
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 � 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindromeProduct {

	private static boolean isPalindrome(int number) {
		String string = String.valueOf(number);
		for(int i=0; i <= string.length() / 2; i ++) {
			if (string.charAt(i) != string.charAt( (string.length()-1) - i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int si = 0, sj = 0;
		int sum = 0;
		for(int i = 100; i <= 999; i++) {
			for(int j = 100; j <= 999; j++) {
				if (isPalindrome(i*j) && i*j>sum) {
					sum=i*j;
					si=i;
					sj=j;
				}
			}	
		}
		System.out.println(si + " * " + sj + "=" + sum);
	}
	
}
