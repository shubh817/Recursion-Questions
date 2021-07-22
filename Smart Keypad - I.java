/*
You will be given a numeric string S. Print all the possible codes for S.

Following vector contains the codes corresponding to the digits mapped.

string table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };

For example, string corresponding to 0 is " " and 1 is ".+@$"

Input Format
A single string containing numbers only.

Constraints
length of string <= 10

Output Format
All possible codes one per line in the following order.

The letter that appears first in the code should come first

Sample Input
12
Sample Output
.a
.b
.c
+a
+b
+c
@a
@b
@c
$a
$b
$c
Explanation
For code 1 the corresponding string is .+@$ and abc corresponds to code 2.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    //static int count=0;
	static String[] mapping = {" ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz"};

	public List<String> letterCombinations(String digits) {
		return null;
	}

	public static void helper(String digits, String comb) {

		if (digits.length() == 0) {
			System.out.println(comb+" ");
			//count++;
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
        //count=0;
		helper(a, "");
// 		System.out.println();
// 		System.out.println(count);
	}

}
