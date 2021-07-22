/*
Replace all occurrences of pi with 3.14

Input Format
Integer N, no of lines with one string per line

Constraints
0 < N < 1000
0 <= len(str) < 1000

Output Format
Output result one per line

Sample Input
3
xpix
xabpixx3.15x
xpipippixx
Sample Output
x3.14x
xab3.14xx3.15x
x3.143.14p3.14xx
Explanation
All occurrences of pi have been replaced with "3.14".
*/
import java.util.*;
public class Main {
    static void stringCheck(String str1,int i,int l)
    {
        if (i==l-1)
        {
            System.out.print(str1.charAt(i));
            return;
        }
        char a=str1.charAt(i);
        char b=str1.charAt(i+1);
        if(a=='p' && b=='i')
        {
            System.out.print("3.14");
            i++;
        }
        else
        {
            System.out.print(a);
        }
        stringCheck(str1,i+1,l);
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        String str="";
        for(int i=0;i<t;i++)
        {
            str = sc.next();
            int l = str.length();
            stringCheck(str,0,l);
            System.out.println();
        }
    }
}
