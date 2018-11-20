package unicodeCalculator;

import java.util.Scanner;

public class UnicodeCalculator {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String string1;
		String string2;
		int difference;
		int string1Val = 0;
		int string2Val = 0;
		int tempVal1;
		int tempVal2;

		System.out.println("Please enter your first string.");
		string1 = scnr.nextLine();
		System.out.println("Please enter your second string.");
		string2 = scnr.nextLine();
		scnr.close();

		for (int i = 0; i < string1.length(); i++) {
			string1Val = string1.charAt(i) + string1Val;
			tempVal1 = string1.charAt(i);
			System.out.println(string1.charAt(i) + ": " + tempVal1);
		}
		for (int i = 0; i < string2.length(); i++) {
			string2Val = string2.charAt(i) + string2Val;
			tempVal2 = string2.charAt(i);
			System.out.println(string2.charAt(i) + ": " + tempVal2);
		}

		difference = Math.abs((string1Val) - (string2Val));

		System.out.println("The Unicode value of string 1 is " + string1Val + ". The Unicode value of string 2 is "
				+ string2Val + ". The absolute value of the difference in Unicode values between your two strings is "
				+ difference + ".");
	}

}
