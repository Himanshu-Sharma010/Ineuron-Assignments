package com.ineuronlearn.main.Assignment;

import java.util.LinkedHashSet;

public class Assignment4 {

	public static void main(String[] args) {

		
		
	//Q.1 WAP to remove Duplicates from a String.

//		public class RemoveDuplicatesFromString {
//		    public static void main(String[] args) {
//		        String str = "Hello, World!";
//		        System.out.println("Original string: " + str);
//		        
//		        String result = removeDuplicates(str);
//		        
//		        System.out.println("String after removing duplicates: " + result);
//		    }
//		    
//		    public static String removeDuplicates(String str) {
//		        // Using LinkedHashSet to preserve the order of characters
//		        LinkedHashSet<Character> set = new LinkedHashSet<>();
//		        
//		        for (int i = 0; i < str.length(); i++) {
//		            set.add(str.charAt(i));
//		        }
//		        
//		        StringBuilder sb = new StringBuilder();
//		        
//		        for (Character ch : set) {
//		            sb.append(ch);
//		        }
//		        
//		        return sb.toString();
//		    }
//		}

		
		
		
		
		//Q.2 WAP to print Duplicates characters from the String.
//		public class PrintDuplicateCharacters {
//		    public static void main(String[] args) {
//		        String str = "Hello, World!";
//		        System.out.println("Original string: " + str);
//		        
//		        System.out.println("Duplicate characters:");
//		        printDuplicateCharacters(str);
//		    }
//		    
//		    public static void printDuplicateCharacters(String str) {
//		        // Converting the string to lowercase to treat uppercase and lowercase characters as the same
//		        str = str.toLowerCase();
//		        
//		        // Iterating through each character in the string
//		        for (int i = 0; i < str.length(); i++) {
//		            char currentChar = str.charAt(i);
//		            
//		            // Checking if the current character is not a space
//		            if (currentChar != ' ') {
//		                // Checking if the current character is already printed as a duplicate
//		                if (str.indexOf(currentChar, i + 1) != -1) {
//		                    // Checking if the current character is not already printed
//		                    if (str.indexOf(currentChar) == i) {
//		                        System.out.println(currentChar);
//		                    }
//		                }
//		            }
//		        }
//		    }
//		}


		
		
		//Q.3 WAP to check if “2552” is palindrome or not.
//		public class PalindromeCheck {
//		    public static void main(String[] args) {
//		        String str = "2552";
//		        System.out.println("Original string: " + str);
//
//		        boolean isPalindrome = checkPalindrome(str);
//
//		        if (isPalindrome) {
//		            System.out.println("The string is a palindrome.");
//		        } else {
//		            System.out.println("The string is not a palindrome.");
//		        }
//		    }
//
//		    public static boolean checkPalindrome(String str) {
//		        int length = str.length();
//		        int mid = length / 2;
//
//		        for (int i = 0; i < mid; i++) {
//		            if (str.charAt(i) != str.charAt(length - 1 - i)) {
//		                return false;
//		            }
//		        }
//
//		        return true;
//		    }
//		}
		
		
		
		
		
		
		//Q.4 WAP to count the number of consonants, vowels, special characters in a String.
//		public class CharacterCount {
//		    public static void main(String[] args) {
//		        String str = "Hello, World!";
//		        System.out.println("Original string: " + str);
//		        
//		        int vowelCount = 0;
//		        int consonantCount = 0;
//		        int specialCharCount = 0;
//		        
//		        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive matching
//		        
//		        for (int i = 0; i < str.length(); i++) {
//		            char ch = str.charAt(i);
//		            
//		            if (ch >= 'a' && ch <= 'z') { // Check if the character is an alphabet
//		                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//		                    vowelCount++;
//		                } else {
//		                    consonantCount++;
//		                }
//		            } else { // Character is not an alphabet
//		                specialCharCount++;
//		            }
//		        }
//		        
//		        System.out.println("Number of vowels: " + vowelCount);
//		        System.out.println("Number of consonants: " + consonantCount);
//		        System.out.println("Number of special characters: " + specialCharCount);
//		    }
//		}

		
		
		
		//Q.5 WAP to implement Anagram Checking least inbuilt methods being used.
//		public class AnagramCheck {
//		    public static void main(String[] args) {
//		        String str1 = "elegant";
//		        String str2 = "agentle";
//		        
//		        System.out.println("Original strings: " + str1 + ", " + str2);
//		        
//		        boolean isAnagram = checkAnagram(str1, str2);
//		        
//		        if (isAnagram) {
//		            System.out.println("The strings are anagrams.");
//		        } else {
//		            System.out.println("The strings are not anagrams.");
//		        }
//		    }
//		    
//		    public static boolean checkAnagram(String str1, String str2) {
//		        // Converting the strings to lowercase for case-insensitive matching
//		        str1 = str1.toLowerCase();
//		        str2 = str2.toLowerCase();
//		        
//		        // Removing all non-alphabetic characters from the strings
//		        str1 = str1.replaceAll("[^a-z]", "");
//		        str2 = str2.replaceAll("[^a-z]", "");
//		        
//		        // Check if the lengths of the strings are equal
//		        if (str1.length() != str2.length()) {
//		            return false;
//		        }
//		        
//		        int[] charCount = new int[26]; // Array to store character frequencies
//		        
//		        // Counting the frequency of characters in the first string
//		        for (int i = 0; i < str1.length(); i++) {
//		            char ch = str1.charAt(i);
//		            charCount[ch - 'a']++;
//		        }
//		        
//		        // Decrementing the frequency of characters in the second string
//		        for (int i = 0; i < str2.length(); i++) {
//		            char ch = str2.charAt(i);
//		            charCount[ch - 'a']--;
//		        }
//		        
//		        // Check if all character frequencies are zero
//		        for (int count : charCount) {
//		            if (count != 0) {
//		                return false;
//		            }
//		        }
//		        
//		        return true;
//		    }
//		}
		
		
		
		
		
		//Q.6 WAP to implement Pangram Checking with least inbuilt methods being used.
//		public class PangramCheck {
//		    public static void main(String[] args) {
//		        String str = "The quick brown fox jumps over the lazy dog";
//		        System.out.println("Original string: " + str);
//		        
//		        boolean isPangram = checkPangram(str);
//		        
//		        if (isPangram) {
//		            System.out.println("The string is a pangram.");
//		        } else {
//		            System.out.println("The string is not a pangram.");
//		        }
//		    }
//		    
//		    public static boolean checkPangram(String str) {
//		        // Convert the string to lowercase for case-insensitive matching
//		        str = str.toLowerCase();
//		        
//		        // Create a boolean array to track the occurrence of each alphabet
//		        boolean[] alphabetOccurrence = new boolean[26];
//		        
//		        // Iterate through each character of the string
//		        for (int i = 0; i < str.length(); i++) {
//		            char ch = str.charAt(i);
//		            
//		            // Check if the character is an alphabet
//		            if (ch >= 'a' && ch <= 'z') {
//		                // Set the corresponding index in the boolean array to true
//		                alphabetOccurrence[ch - 'a'] = true;
//		            }
//		        }
//		        
//		        // Check if all alphabets have occurred at least once
//		        for (boolean occurred : alphabetOccurrence) {
//		            if (!occurred) {
//		                return false;
//		            }
//		        }
//		        
//		        return true;
//		    }
//		}


		
		
		
		
		
		//Q.7 WAP to find if String contains all unique characters.
//		public class UniqueCharactersCheck {
//		    public static void main(String[] args) {
//		        String str = "abcdefg";
//		        System.out.println("Original string: " + str);
//		        
//		        boolean hasUniqueChars = checkUniqueCharacters(str);
//		        
//		        if (hasUniqueChars) {
//		            System.out.println("The string contains all unique characters.");
//		        } else {
//		            System.out.println("The string does not contain all unique characters.");
//		        }
//		    }
//		    
//		    public static boolean checkUniqueCharacters(String str) {
//		        // Iterate through each character in the string
//		        for (int i = 0; i < str.length() - 1; i++) {
//		            char ch = str.charAt(i);
//		            
//		            // Compare the current character with the remaining characters
//		            for (int j = i + 1; j < str.length(); j++) {
//		                if (ch == str.charAt(j)) {
//		                    // Found a duplicate character, return false
//		                    return false;
//		                }
//		            }
//		        }
//		        
//		        // No duplicate characters found, return true
//		        return true;
//		    }
//		}

		
		
		
		
		
		//Q.8 WAP to find the maximum occurring character in a String.
//		public class MaxOccurringCharacter {
//		    public static void main(String[] args) {
//		        String str = "abracadabra";
//		        System.out.println("Original string: " + str);
//		        
//		        char maxChar = findMaxOccurringCharacter(str);
//		        
//		        System.out.println("Maximum occurring character: " + maxChar);
//		    }
//		    
//		    public static char findMaxOccurringCharacter(String str) {
//		        int[] charCount = new int[256]; // Assuming ASCII characters
//		        
//		        // Count the frequency of each character in the string
//		        for (int i = 0; i < str.length(); i++) {
//		            char ch = str.charAt(i);
//		            charCount[ch]++;
//		        }
//		        
//		        char maxChar = ' ';
//		        int maxCount = 0;
//		        
//		        // Find the character with maximum occurrence
//		        for (int i = 0; i < str.length(); i++) {
//		            char ch = str.charAt(i);
//		            
//		            if (charCount[ch] > maxCount) {
//		                maxChar = ch;
//		                maxCount = charCount[ch];
//		            }
//		        }
//		        
//		        return maxChar;
//		    }
//		}


	}

}
