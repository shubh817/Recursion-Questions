/*
Take as input N, a number. Write a recursive function which prints counting from 0 to N in lexicographical order. In lexicographical (dictionary) order 10, 100 and 109 will be printed before 11.

Input Format
Enter a number N.

Constraints
None

Output Format
Display all the numbers upto N in a lexicographical order

Sample Input
10
Sample Output
0 1 10 2 3 4 5 6 7 8 9 
*/
import java.util.*;
public class Main {
    public static void lexicographical(int i, int e) {
		if(i > e) {
			return;
		}
		
		System.out.print(i+" ");
		
		int cn = 0;
		
		if(i == 0) {
			cn = 1;
		}
		
		while(cn <= 9) {
			lexicographical(i * 10 + cn, e);
			cn++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		lexicographical(0, n);
	}
}
