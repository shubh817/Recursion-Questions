/*
Take as input N, the size of array. Take N more inputs and store that in an array. Write a recursive function which returns true if the array is sorted and false otherwise. Print the value returned.

Input Format
Enter a number N and take N more inputs and store in an array

Constraints
None

Output Format
Display the Boolean result

Sample Input
4
1
2
3
4
Sample Output
true
*/
import java.util.*;
public class Main {

    static boolean arraySorted(int ar[], int n)
    {
        if(n==1 || n==0)
        {
            return true;
        }
        for (int i = 1; i < n; i++)
        {
            if (ar[i - 1] > ar[i])
            {
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        if(arraySorted(a,t))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
