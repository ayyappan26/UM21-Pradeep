package com.ultramain.um21.natural;

import java.util.Scanner;

public class IncreasingTest {
	public static void main(String[] args) {
		IncreasingTest checkNumber = new IncreasingTest();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number : ");
		int num = scanner.nextInt();
		if (IncreasingTest.check(num)) {
			System.out.println("The entered number is Increasing Number ");

		} else {
			System.out.println("Not a Increasing Number ");
		}

		scanner.close();
	}

	public static boolean check(int num) {
		int large = 9;
		while (num > 0) {
			int remainder = num % 10;
			if (remainder > large) {
				return false;
			} else {
				large = remainder;
			}
			num /= 10;
		}
		return true;
	}
}