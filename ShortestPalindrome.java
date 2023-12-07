/* You are given a string s. You can convert s to a palindrome by adding characters in front of it.
Return the shortest palindrome you can find by performing this transformation. */
import java.util.Scanner;
public class Palindrome {
    public String shortestPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (j >= 0) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
            }
            j--;
        }
        if (i == s.length()) {
            return s;
        }
        String suffix = s.substring(i);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String mid = shortestPalindrome(s.substring(0, i));
        return prefix + mid + suffix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        Palindrome palindrome = new Palindrome();
        String result = palindrome.shortestPalindrome(input);
        System.out.println("Shortest Palindrome: " + result);
    }
}
/* Explanation of code:
This code defines a method shortestPalindrome within a class called Palindrome. The method takes a string s as input and returns the shortest palindrome by adding characters in front of it.
We start by initializing two pointers i and j to the start and end of the string respectively. 
Then, we start a loop to find the longest palindrome suffix. If the character at ith position is equal to jth position, increment i and decrement j.
If the entire string is a palindrome, return that string.
We then extract the non palindrome suffix by using s.substring(i). 
We then create the palindrome by adding characters in front by using StringBuilder method.
The summation of prefix, mid and suffix is returned.
In the main function, user input is taken in form of a string.
We will then call the shortestPalindrome method and display the result.
*/

