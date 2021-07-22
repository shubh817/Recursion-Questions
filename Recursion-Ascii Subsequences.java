/*
Take as input str, a string. We are concerned with all the possible ascii-subsequences of str. E.g. “ab” has following ascii-subsequences “”, “b”, “98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”

a. Write a recursive function which returns the count of ascii-subsequences for a given string. Print the value returned.

b. Write a recursive function which prints all possible ascii-subsequences for a given string (void is the return type for function).

Input Format
Enter the string

Constraints
None

Output Format
Display the number of ASCII-subsequences and display all the ASCII- subsequences

Sample Input
ab
Sample Output
 b 98 a ab a98 97 97b 9798
9
*/
import java.util.*;
public class Main {

    static int count;

    
    public static void genSubs(String input, String ans) {

		if (input.length() == 0) {
			count++;
			System.out.print(ans+" ");
			return;
		}
		char cc = input.charAt(0); // a

		genSubs(input.substring(1), ans);
		genSubs(input.substring(1), ans + cc);
        genSubs(input.substring(1), ans + (int)cc);

	}
    
    public static void main(String args[]) {
        // Your Code Here
        count = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
		genSubs(str, "");
        System.out.println("\n"+count);
		
    }
}
