/*
Take as input str, a string. str represents keys pressed on a nokia phone keypad. We are concerned with all possible words that can be written with the pressed keys.

Assume the following alphabets on the keys: 1 -> abc , 2 -> def , 3 -> ghi , 4 -> jkl , 5 -> mno , 6 -> pqrs , 7 -> tuv , 8 -> wx , 9 -> yz

E.g. “12” can produce following words “ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf”

a. Write a recursive function which returns the count of words for a given keypad string. Print the value returned.

b.Write a recursive function which prints all possible words for a given keypad string (void is the return type for function).

Input Format
Single line input containing a single integer.

Constraints
1 <= Length of string <= 10^3

Output Format
Print all the words in a space separated manner. Also print the count of these numbers in next line.

Sample Input
12
Sample Output
ad ae af bd be bf cd ce cf
9
Explanation
1 can correspond to 'a' , 'b' or 'c' .
2 can correspond to 'd', 'e' or 'f'.
We print all combinations of these
*/

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    static int count=0;
	static String[] mapping = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public List<String> letterCombinations(String digits) {
		return null;
	}

	public static void helper(String digits, String comb) {

		if (digits.length() == 0) {
			System.out.print(comb+" ");
			count++;
			return;
		}
		char digitPressed = digits.charAt(0); // '2' char
		int index = digitPressed - '0'; // int 2

		String mappedString = mapping[index];
		// System.out.println(mappedString);

		for (int i = 0; i < mappedString.length(); i++) {

			String bachiKuchiString = digits.substring(1);
			char choice = mappedString.charAt(i);
			helper(bachiKuchiString, comb + choice);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        count=0;
		helper(a, "");
		System.out.println();
		System.out.println(count);
	}

}
