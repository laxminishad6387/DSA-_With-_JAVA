package BackTrackingProblem;

import java.util.Scanner;

public class Rat_in_maze_probelm {
    public static void printSolution(int [][]output,int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int [][]maze, int i, int j, int n)
    {
        if (i>=0 && i<n && j>=0 && j<n && maze[i][j]==1) {
            return true;
        }
        else 
        {
            return false;
        }
    }

    public static boolean solveMaze(int [][]maze, int [][]output,int i , int j, int n)
    {
            // base condition
            if (i==n-1 && j==n-1 && maze[i][i]==1) {
                 output[i][j]=1;
                 return  true;
            }
        // check current position is safe or not
        if (isSafe(maze, i, j, n)==true) {
            if (output[i][j]==1) {
                return  false;
            }
            output[i][j]=1;
        
        // move  to  down
        if (solveMaze(maze, output, i+1, j, n)) {
            return  true;
        }
        // move to left
        if (solveMaze(maze, output, i, j+1, n)) {
            return  true;
        }
        // backtracking 
        output[i][j]=0;
        return false;
    }
        return false;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of sqaure maze");
        int size=sc.nextInt();
        int [][]maze=new int[size][size];
        System.out.println("enter the binary value on arrray ");
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                maze[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        int n=maze.length;
        int output[][]=new int[n][n];
       if (solveMaze(maze, output, 0, 0, n)==true) {
        printSolution(output, n);
       } 
       else
       {
        System.out.println("solution does not exist");
       }
    }
}
