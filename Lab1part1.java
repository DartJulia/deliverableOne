package unit1Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab1part1 {
	public static void main(String[] args) {
		getSum();

	}


	public static void getSum() {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> num1List = new ArrayList<Integer>();
		ArrayList<Integer> num2List = new ArrayList<Integer>();
		ArrayList<Integer> sumList = new ArrayList<Integer>();
		
		int userNumber1;
		int userNumber2;
		boolean checkEquality = true;

		// Ask user for any two numbers of the same length
		System.out.println("Please enter two numbers (non-negative, whole number), each containing the same amount of digits: ");
		System.out.print("First number: ");
		userNumber1 = scnr.nextInt();
		System.out.print("Second number: ");
		userNumber2 = scnr.nextInt();

		// Convert to string to check for length equality between two inputed integers
		int userNumLength1 = Integer.valueOf(userNumber1).toString().length();
		int userNumLength2 = Integer.valueOf(userNumber2).toString().length();

		// If number is not greater than 0, let user re-enter valid numbers
		if ((userNumber1 < 0) || (userNumber2 < 0)) {

			System.out.print("Error, need non-negative numbers and numbers of the same length. ");
			System.out.println("Please enter two valid numbers: ");
			System.out.print("First number: ");
			userNumber1 = scnr.nextInt();
			System.out.print("Second number: ");
			userNumber2 = scnr.nextInt();
		} else {

		}

		// If number is not of equal digits, let user re-enter valid numbers
		if (userNumLength1 != userNumLength2) {

			System.out.println("Error, need non-negative numbers and numbers of the same length.");
			System.out.println("Please enter two numbers containing the same amount of digits: ");
			System.out.print("First number: ");
			userNumber1 = scnr.nextInt();
			System.out.print("Second number: ");
			userNumber2 = scnr.nextInt();
		} else {

		}


		// Convert numbers from integers to strings in order to index through each digit
		String number1 = Integer.toString(userNumber1);
		String number2 = Integer.toString(userNumber2);
		
		// Index each digit in number 1 and 2 and add in a new array list for each
		// number
		for (int i = 0; i < number1.length(); i++) {
			int x = Character.getNumericValue(number1.charAt(i));
			num1List.add(new Integer(x));
			int y = Character.getNumericValue(number2.charAt(i));
			num2List.add(new Integer(y));
			
		}
		// check validity System.out.println(num1List);
		// check validity System.out.println(num2List);
		
		// Access each array list of digits and get the sum values of digits in the
		// corresponding location in the list (i.e 0 + 0, 1+1).
		for (int i = 0; i < number1.length(); i++) {
	       int sumNums = num1List.get(i) + num2List.get(i);
			sumList.add(new Integer(sumNums));
		}
		// check validity System.out.println(sumList);

		// Compare the sums for equality by comparing each value in the list to the
		// value at position 0 in list.
		// Use boolean checkEquality to determine final output of program (t/f)
		for (int i = 1; i < sumList.size(); i++) {
			int x = sumList.get(i);
			int y = sumList.get(0);
			if (x != y) {
				checkEquality = false;
				break;
			} else {
				checkEquality = true;
			}


		}
		// Print true if all numbers are of equal value, print false if one or more
		// values are different.
		if (checkEquality == true) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

			
		scnr.close();
	
	
	
	}
}
