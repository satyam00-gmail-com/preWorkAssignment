import java.util.Scanner;

public class doMultipleCheckByInput {

	// function to checkPalindrome
	public void checkPalindrome(Scanner sc) {
		int i = 0;
		String choiceStr;
		System.out.println("Enter your choice to Find palindrome of number \n");
		Integer subChoice = sc.nextInt();
		choiceStr = subChoice.toString();
		int j = choiceStr.length() - 1;
		while (i <= j) {
			// System.out.println("Value of i, j are \t"+ i + " " + j );
			if (i == j) {
				System.out.println("The entered number is a palindrome .\n");
			}
			if (choiceStr.charAt(i) == choiceStr.charAt(j)) {
				i++;
				j--;
			} else {
				System.out.println("The entered number is not a palindrome .\n");
			}
		}

		return;
	}

	// function to printPattern
	public void printPattern(Scanner sc) {
		System.out.println("Enter your choice to print the * pattern \n");
		Integer subChoice = sc.nextInt();
		if (subChoice <= 0) {
			System.out.println("Enter number greater than 0 \n");
			return;
		}
		for (int i = subChoice; i >= 0; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

	// function to check no is prime or not
	public void checkPrimeNumber(Scanner sc) {	
		System.out.println("Enter your choice to to check prime number \n");
		Integer subChoice = sc.nextInt();
		if (subChoice <= 1) {
			System.out.println(subChoice + " is not valid input,please enter value greater than 0 \n");
		} else if (subChoice == 1) {
			System.out.println(subChoice + " is a not prime number \n");
		} else if (subChoice > 1) {
			for (int i = 2; i <= subChoice; i++) {
				if (subChoice % i == 0 && subChoice != i) {
					System.out.println(subChoice + " is not a Prime Number \n");
				} else if (subChoice % i == 0 && subChoice == i) {
					System.out.println(subChoice + " is a Prime Number \n");
				}
			}
		} else {
			System.out.println(subChoice + " is an invalid input \n");
		}
		}
			

	// function to print Fibonacci Series
	public void printFibonacciSeries(Scanner sc) {
		// initialize the first and second value as 0,1 respectively.
		int first = 0, second = 1;
		int secNextVal = second;
		System.out.println("Enter your choice to to check preceding numbers in fabonacci Series \n");
		Integer subChoice = sc.nextInt();
		System.out.print(first);
		for (int i = first; first + second <= subChoice; i++) {
			secNextVal = first + second;
			System.out.print(" " + secNextVal);
			first = second;
			second = secNextVal;
		}
	}

	// main method which contains switch and do while loop
	public static void main(String[] args) {
		doMultipleCheckByInput obj = new doMultipleCheckByInput();
		Integer choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n Enter your choice from below list.\n" + "1. Find palindrome of number \n"
					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number \n"
					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit \n");

			choice = sc.nextInt();
			switch (choice) {
			case 0: {
				choice = 0;
			}
				break;
			case 1: {
				obj.checkPalindrome(sc);
			}
				break;
			case 2: {
				obj.printPattern(sc);
			}
				break;
			case 3: {
				obj.checkPrimeNumber(sc);
			}
				break;
			case 4: {
				obj.printFibonacciSeries(sc);
			}
				break;
			default: {
				System.out.println("Invalid choice. Enter a valid no.\n");
			} // closing default
			} // closing switch
		} // closing do
		while (choice != 0);
		{
			System.out.println("Exited Successfully!!!");
			sc.close();
			System.exit(0);
		} // closing while
	} // closing main
} // closing class
