/*
Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
The output strings should be printed in the sorted order considering '(' has higher value than ')'.

Input Format
Single line containing an integral value 'n'.

Constraints
1<=n<=11

Output Format
Print the balanced parentheses strings with every possible solution on new line.

Sample Input
2
Sample Output
()() 
(()) 
*/
import java.util.*;
public class Main {
    private static void genP(String ans, int n , int ob, int cb)
    {
        if(ob==n && cb==n)
        {
            System.out.println(ans);
            return;
        }
        if(ob > cb) {
			genP(ans + ')', n, ob, cb + 1);
		}
		
		if(ob < n) {
			genP(ans + '(', n, ob + 1, cb);
		}
    } 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        genP("",n,0,0);
    }
}
