package model;

public class Palindrome {
	
	/* Best solution: isPalindrome
	 * 		because no unnecessary string creation therefore memory efficient
	 * 				avoid recursion
	 * 				handles null inputs safely therefore safe from NullPointerException
	 * 				built in normalization of characters
	 */
	public boolean isPalindrome(String input) {
        if (input == null) return false;

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            char leftChar = Character.toLowerCase(input.charAt(left));
            char rightChar = Character.toLowerCase(input.charAt(right));

            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
	
	public boolean isPalindrome2(String input) {
        String word = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = word.length() - 1;

        while (left < right)
        {
            if (word.charAt(left) != word.charAt(right))
            {
                return false;
            }
            
            left++;
            right--;
        }

        return true;
    }

	public boolean isPalindrome3(String input) {
		// String word = input.toLowerCase().replaceAll("[\\s,.:'?!]", "");
		String word = input.toLowerCase().replaceAll("[^a-z0-9]", ""); // better alternative
		
		if(word.length() == 0 || word.length() == 1) {
			return true;
		}
		else {
			for(int i = 0; i < word.length() / 2; i++) {
				if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
					return false;
				}
			}
			return true;
		}
	}
	
	public boolean isPalindrome4(String input) {
		String word = input.toLowerCase().replaceAll("[^a-z0-9]", "");
		
		if(word.length() == 0 || word.length() == 1) {
			return true;
		}
		else {
			for(int i = 0; i < word.length() / 2; i++) {
				if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
					return false;
				}
			}
			return true;
		}
	}
	
	/* Best recursive solution: isPalindromeRecursion
	 * 		because separation of concerns: cleansing input and checking if palindrome are separate
	 * 		minimizes repetition of code and improves readability
	 */
	public boolean isPalindromeRecursion(String input) {
	    String word = input.toLowerCase().replaceAll("[^a-z0-9]", "");
	    return isPalindromeRecursionHelper(word);
	}
	private boolean isPalindromeRecursionHelper(String word) {
	    int length = word.length();
	    
	    if (length <= 1) {
	        return true;
	    }
	    if (word.charAt(0) != word.charAt(length - 1)) {
	        return false;
	    }
	    
	    return isPalindromeRecursionHelper(word.substring(1, length - 1));
	}
	
	public boolean isPalindromeRecursion2(String input) {
		String word = input.toLowerCase().replaceAll("[^a-z0-9]", "");
		
		if(word.length() == 0 || word.length() == 1) {
			return true;
		}
		else {
			return word.charAt(0) == word.charAt(word.length() - 1) && isPalindromeRecursion(word.substring(1, word.length() - 1));
		}
	}
	
	public boolean isPalindromeRecursion3(String input) {
		String word = input.toLowerCase().replaceAll("[^a-z0-9]", "");
		int wordLength = word.length();
		
		if(wordLength <= 1) {
			return true;
		}
		else {
			char firstChar = word.charAt(0);
			char lastChar = word.charAt(word.length() - 1);
			String middle = word.substring(1, word.length() - 1);
			
			return firstChar == lastChar && isPalindromeRecursion(middle);
		}
	}
	
}
