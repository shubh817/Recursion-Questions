/*
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. Write a recursive function which returns the last index at which M is found in the array and -1 if M is not found anywhere. Print the value returned.

Input Format
Enter a number N and add N more numbers to an array, then enter number M to be searched

Constraints
None

Output Format
Display the last index at which the number M is found

Sample Input
5
3
2
1
2
3
2
Sample Output
3
*/
import java.util.*;
public class Main {
    static int arrayCheck(int ar[], int n, int M)
    {
        if(n==0)
        {
            return -1;
        }
        for (int i = n-1; i > 0; i--)
        {
            if (ar[i]==M)
            {
                return i;
            }
        }
        return -1;
    }


    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];//original array
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt(); //value to be checked
        System.out.println(arrayCheck(a,t,m));
    }
}
