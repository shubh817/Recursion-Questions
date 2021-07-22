/*
Take as input str, a number in form of a string. Write a recursive function to convert the number in string form to number in integer form. E.g. for “1234” return 1234. Print the value returned.

Input Format
Enter a number in form of a String

Constraints
1 <= Length of String <= 10

Output Format
Print the number after converting it into integer

Sample Input
1234
Sample Output
1234
Explanation
Convert the string to int. Do not use any inbuilt functions.
*/
import java.util.*;
public class Main {
    static void stringCheck(String str,int i,int l)
    {
        if(i==l)
            return;
        int ch = str.charAt(i);
            System.out.print((char)ch);
        stringCheck(str,i+1,l);
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
