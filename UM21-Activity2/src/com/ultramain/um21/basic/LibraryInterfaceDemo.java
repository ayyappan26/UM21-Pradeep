package com.ultramain.um21.basic;

public class LibraryInterfaceDemo {
	public static void main(String arg[]) {
		KidUser mykid = new KidUser();
		mykid.age = 10;
		mykid.registerAccount();
		mykid.bookType = "Kids";
		mykid.requestBook();
		mykid.age = 18;
		mykid.registerAccount();
		mykid.bookType = "Fiction";
		mykid.requestBook();
		AdultUser myadult = new AdultUser();
		myadult.age = 5;
		myadult.registerAccount();
		myadult.bookType = "Kids";
		myadult.requestBook();
		myadult.age = 23;
		myadult.registerAccount();
		myadult.bookType = "Fiction";
		myadult.requestBook();

	}

}

interface LibraryUser {
	public void registerAccount();

	public void requestBook();
}

class KidUser implements LibraryUser {
	public int age;
	public String bookType;

	public void registerAccount() {

		if (age < 12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		if (age > 12) {
			System.out.println("Sorry,Age must be less than 12 to register as a kid");
		}
	}

	public void requestBook() {
		if (bookType.equals("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");

		} else {
			System.out.println("Oops, you are allowed to take only kids books");
		}

	}

}

class AdultUser implements LibraryUser {
	public int age;
	public String bookType;

	public void registerAccount() {
		if (age > 12) {
			System.out.println("You have successfully registered under anAdult Account");
		}
		if (age < 12) {
			System.out.println("Sorry, Age must be greater than 12 to register as an Adult");
		}
	}

	public void requestBook() {
		if (bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		} else {
			System.out.println("Oops, you are allowed to take only adult fiction books");
		}

	}

}
