/*
In a mathematics class, Teacher ask Alice to find the number of all n digit distinct integers which is formed by the two distinct digits ai and bi but there is a rule to form n digit integer.

Rule: She has to form n digit integer by using two digits ai and bi without consecutive bi.

Alice is very weak in maths section. Help her to find the number of such n digit integers.

Input Format
The first line contains T, the number of test cases. Further T lines contains the value n which is the number of digit in the integer.

Constraints
1<=T<=20
1<=n<=25

Output Format
For each test case print the number of such n digit integer.

Sample Input
3
1
2
3
Sample Output
#1 : 2
#2 : 3
#3 : 5
Explanation
For n=1 : integers = a, b . For n=2 : integers = aa, ab, ba For n=3 : integers = aaa, aab, aba, baa, bab
*/

import java.util.*;
public class Main
{
	private static int fib(int n)
	{
    	if(n == 0 || n==1){
    		return 1;
    	}
    	return fib(n-2) + fib(n-1);
	}
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ar[] = new int[t];
        for(int i=0;i<t;i++)
        {
            ar[i]=sc.nextInt();
            System.out.println("#"+(i+1)+" : "+fib(ar[i]+1));
        }
	}
}
