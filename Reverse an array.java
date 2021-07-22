/*
Take as input N, a number. Take N more inputs and store that in an array. Write a recursive function which reverses the array. Print the values of reversed array.

Input Format
Enter a number N and take N more inputs

Constraints
None

Output Format
Display values of the reversed array

Sample Input
4
1
2
3
4
Sample Output
4 3 2 1
*/
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=t-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }

    }
}
