package recursion;

import java.util.Scanner;

public class factorial {
    public static int factorialNumber(int n)
    {
        // base condition
        if (n<=1) {
            return 1;
        }
        else{
            return n*factorialNumber(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    int result=factorialNumber(n);
    System.out.println("factorial of "+n +" is : "+result);
    }
}
