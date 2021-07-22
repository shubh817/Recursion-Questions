/*
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. Write a recursive function which returns the first index at which M is found in the array and -1 if M is not found anywhere. Print the value returned.

Input Format
Enter a number N and add N more elements to an array, then enter a number M

Constraints
None

Output Format
Display the first index at which number M is found

Sample Input
5
3
2
1
2
2
2
Sample Output
1
*/
import java.util.*;
public class Main {
    static int arrayCheck(int ar[], int n, int M)
    {
        if(n==0)
        {
            return -1;
        }
        if(ar[0]==M)
        {
            return 0;
        }
        for (int i = 0; i < n; i++)
        {
            if (ar[i]==M)
            {
                return 1;
            }
        }
        return -1;
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
        int m=sc.nextInt(); //value to be checked
        System.out.println(arrayCheck(a,t,m));
    }
}
