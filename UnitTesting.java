package osu.cse2123;
/**
 * 
 * @author Connor Kovacs
 * @version 09062023
 *
 */

public class UnitTesting {

	/**
	 * Returns the integer average of two integers.
	 * @param num1
	 * @param num2
	 * @return the integer average of num1 and num2
	 */
	public static double average(double num1, double num2) {
		return (num1 + num2)/2;
	}

	/**
	 * Determines if a number is odd
	 * @param num number to check for parity
	 * @return true if num is odd, false if even
	 */
	//We want to test if the remainder is not equal to 0 because when using a negative integer with a remainder of -1 it is not equal to 1 so it compiles it as false even though the truth is true
	//This allows positive and negative numbers to be tested with our new implementation
	public static boolean isOdd(int num) {
		return num % 2 != 0;
	}

	/**
	 * Determines if an array holds all even values
	 * @param value
	 * @param array
	 * @return true if all values in the array are even, false otherwise.
	 */
	public static boolean allEven(int[] array) {
		boolean result = true;//Changed the boolean to true in order to process our all even numbers and not get a fail because of the result being false
		for (int i=0; i<array.length; i++) {
			if (array[i] % 2 != 0) { //same change on this in order to find sort even and odd numbers correctly 
				result = false;	
			}//Taking away the else statement because we don't need to declare result as true if we made boolean result true
		}
		return result;
	}

	/**
	 * Determines if a string is a palindrome
	 * @param str string to test
	 * @return true if str is a palindrome, false otherwise
	 */
	public static boolean isPalindrome(String str) {
		boolean pal = true;
		int stop = (str.length())/2;//The bug comes from here and 6 letter strings that have the first two same in the front of the string and the back of the string for ex: tuckut was a test case and it showed up true
		for (int i=0; i<stop; i++) {//With having our stop int it would read strings that have an even number of characters so when the stop method is going with the length minus 1 / 2 it creates an issues because it takes 5/2=2 
			int end = str.length()-1-i;//With that happening it doesn't compare all the elements in the string and compares wrong so by taking the -1 from the strings length and just str.length/2 it allows us to compute the even number of char strings also 
			if (str.charAt(i) != str.charAt(end)) {//With that change the odd strings will still be fine because if we have a odd string it will compare the elements on both halves and just leave the middle element to compare 
				pal = false;
			}
		}
		return pal;
	}
}
