package BackTrackingProblem;

import java.util.Scanner;

public class Tiling_Problem {

    public static  int getways(int n)
    {
        
        //  base condition
        if (n<=3) {
            return n;
        }
        else
        {
            return getways(n-1)+getways(n-2);
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the valur of n .which is wall");
       int num=sc.nextInt();
       int result=getways(num);
       System.out.println("the result of wall is : "+result);
    }
}
