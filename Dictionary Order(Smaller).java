/*
Take as input str, a string. Write a recursive function which returns all the words possible by rearranging the characters of this string which are in dictionary order smaller than the given string. The output strings must be lexicographically sorted.

Input Format
Single line input containing a string

Constraints
Length of string <= 25

Output Format
Display all the words which are in dictionary order smaller than the string entered in a new line each. The output strings must be sorted.

Sample Input
cab
Sample Output
abc
acb
bac
bca
Explanation
The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" . Only four of them are lexicographically less than "cab". We print them in lexicographical order.
*/
import java.util.*;
public class Main {
    private static void sol(String inp, String ans,String fi) {
		if(inp.length() == 0) {
            String temp = ans;
            //System.out.println(ans);
            if(temp.compareTo(fi)<0)
            {
                System.out.println(ans);
            }
			return;
		}
		for(int i = 0; i < inp.length(); i++) {
			String bachiHuiString = inp.substring(0, i) + inp.substring(i + 1);
			char nikalaFixed = inp.charAt(i);
			
			sol(bachiHuiString, ans + nikalaFixed,fi);
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String temp = sc.next();
        char[] arr = temp.toCharArray();
        Arrays.sort(arr);
        sol(String.valueOf(arr), "",temp);
	}
}
