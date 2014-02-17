/**
 * 
 */
package com.datastructures.prep;

/**
 * @author vjhome
 * 
 */
public class StringCode {

	

	/**
	 * Problem: Implement an algorithm to determine if a string has all unique
	 * characters. What if you can not use additional data structures?
	 * 
	 * @param str
	 */
	public boolean isUniqueCharString(String str) {

		// Declare a boolean array to store if an ASCII character have been
		// visited already
		boolean all_char[] = new boolean[256];
		// iterate through each character in string
		for (int i = 0; i < str.length(); i++) {
			// check if it has been used before
			if (all_char[str.charAt(i)]) {
				// if Used return false
				return false;
			} else {
				// else mark used
				all_char[str.charAt(i)] = true;
			}
		}
		return true;
	}
}
