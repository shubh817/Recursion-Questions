/*
Take as input str, a string. Write a recursive function which returns a new string in which all duplicate consecutive characters are separated by a ‘ * ’. E.g. for “hello” return “hel*lo”. Print the value returned

Input Format
Enter a String

Constraints
1<= Length of string <= 10^4

Output Format
Display the resulting string (i.e after inserting (*) b/w all the duplicate characters)

Sample Input
hello
Sample Output
hel*lo
Explanation
We insert a "*" between the two consecutive 'l' .
*/
import java.util.*;
public class Main {
    static void stringCheck(String str1,int i,int l)
    {
        if (i == l-1)
        {
            System.out.print(str1.charAt(i));
            return;
        }
        char ch = str1.charAt(i);
        char ch1=str1.charAt(i+1);
        if(ch==ch1)
            System.out.print(ch+"*");
        else
            System.out.print(ch);
        stringCheck(str1,i+1,l);
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
