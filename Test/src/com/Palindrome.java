package com;
import java.util.Scanner;

/**
 * @author 
 *
 */
public class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.nextLine();
			if(checkPalindrome(input)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}

	/**
	 * @param string
	 * @return
	 */
	private static boolean checkPalindrome(String string) {
		char[] chars = string.replaceAll(" ", "").toLowerCase().toCharArray();
		for (int i = 0; i < chars.length / 2; ++i) {
			if (chars[i] != chars[chars.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}

}
