/*Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal 
substring consisting of non-space characters only.
*/
import java.util.Scanner;
class LengthOfString{
	public int lengthOfLastWord(String s){
		String trimmed_s=s.trim();
		int count=0;
		for(int i=trimmed_s.length()-1; i>=0; i--){
			if(trimmed_s.charAt(i) != ' '){
				count++;
			}
			else{
				break;
			}
		}
		return count;
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s= sc.nextLine();
		lengthOfLastWord(s);
	}
}
/* Explanation and algorithm of Length Of Last Word in a string:

To obtain the length of the last word present in a string, we will first have to modify the string by trimming it so that the whitespaces are not counted during counting of the characters. s.trim() trims all the whitespaces in string s; we assign the trimmed string to a new variable called trimmed_s.
Now, to store the length of the last word we will initialize a variable count with value 0.
For counting the number of charcaters, we will iterate through the string starting from the last word i.e. in reverse order.
We will run the loop starting from trimmed string's last word until no character is left.
If we do not encounter a whitespace, we will keep incrementing the value of count until a whitespace occurs; then we will break out of the loop. 
This function will return the value of count variable which is required of the problem statement.

Algorithm: Length Of Last Word
Input: A maximal string s
1. trimmed_String=s.trim()
2. Initialize a variable 'count' to 0 to keep track of length of last word
3. Iterate through the string in reverse order:
	trimmed_String.length()-1
4. If character is not whitespace, count++; else break; out of the loop.
5. return count.
*/
