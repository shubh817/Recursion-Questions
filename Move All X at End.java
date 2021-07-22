/*
Take as input str, a string. Write a recursive function which moves all ‘x’ from the string to its end.
E.g. for “abexexdexed” return “abeedeedxxx”.
Print the value returned

Input Format
Single line input containing a string

Constraints
Length of string <= 1000

Output Format
Single line displaying the string with all x's moved at the end

Sample Input
axbxc
Sample Output
abcxx
Explanation
All x's are moved to the end of string while the order of remaining characters remain the same.
*/
import java.util.*;
public class Main {
    static void stringCheck(String str1,int i,int l)
    {
        if (i >= l)
            return;
        char ch = str1.charAt(i);
        if(ch!='x')
            System.out.print(ch);
        stringCheck(str1,i+1,l);
        if(ch=='x')
            System.out.print(ch);
        return;
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int l = str.length();
        stringCheck(str,0,l);
    }
}
