package console_app;

import model.*;
import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word, sentence, or a phrase: ");
		String word = scanner.nextLine();
		
		Palindrome p = new Palindrome();
		
		if(p.isPalindrome(word) == true && p.isPalindromeRecursion(word) == true) {
			System.out.println(word + " is a palindrome.");
		}
		else if(p.isPalindrome(word) == false && p.isPalindromeRecursion(word) == false) {
			System.out.println(word + " is not a palindrome.");
		}
		else {
			System.out.println("Error");
		}
		
		scanner.close();
	}

}
