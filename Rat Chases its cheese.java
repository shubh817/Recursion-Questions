/*
You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. The rat can move from a position towards left, right, up or down on the grid.
Initially rat is on the position (1,1). It wants to reach position (N,M) where it's cheese is waiting for. There exits a unique path in the grid . Find that path and help the rat reach its cheese.

Input Format
First line contains 2 integers N and M denoting the rows and columns in the grid.
Next N line contains M characters each. An 'X' in position (i,j) denotes that the cell is blocked and ans 'O' denotes that the cell is empty.

Constraints
1 <= N , M <= 10

Output Format
Print N lines, containing M integers each. A 1 at a position (i,j) denotes that the (i,j)th cell is covered in the path and a 0 denotes that the cell is not covered in the path.
If a path does not exits then print "NO PATH FOUND"

Sample Input
5 4
OXOO
OOOX
XOXO
XOOX
XXOO
Sample Output
1 0 0 0 
1 1 0 0 
0 1 0 0 
0 1 1 0 
0 0 1 1 
*/
import java.util.*;

public class Main {
	public static void main(String args[]) 
    {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] arr = new char[n][m];
		for (int i = 0; i < n; i++)
        {
			String str = sc.next();  
			for (int j = 0; j < m; j++) 
            {
				arr[i][j] = str.charAt(j);
			}
		}

		if (!findPath(arr, n, m)) {
			System.out.println("NO PATH FOUND");
		}

	}

	public static boolean findPath(char[][] maze, int n, int m) {
		int path[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				path[i][j] = 0;
			}

		}

		return findpath(maze, n, m, 0, 0, path);

	}

	public static boolean findpath(char[][] maze, int n, int m, int x, int y, int[][] path) {

		if (x < 0 || x >= n || y < 0 || y >= m) 
        {
            			return false;
		}

		if (x == n - 1 && y == m - 1) 
        {
			path[x][y] = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(path[i][j] + " ");
				}
				System.out.println();
			}

			return true;
		}

		if (maze[x][y] == 'X' || path[x][y] == 1) 
        {
			return false;
		}

		path[x][y] = 1;
		if (findpath(maze, n, m, x, y + 1, path)) {
			path[x][y] = 0;
			return true;
		}

		
		if (findpath(maze, n, m, x, y - 1, path)) {
			path[x][y] = 0;
			return true;
		}

		
		if (findpath(maze, n, m, x - 1, y, path)) {
			path[x][y] = 0;
			return true;
		}

		
		if (findpath(maze, n, m, x + 1, y, path)) {
			path[x][y] = 0;
			return true;
		}
		path[x][y] = 0;
		return false;

	}
}
