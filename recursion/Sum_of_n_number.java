package recursion;

import java.util.Scanner;

public class Sum_of_n_number {
    public static int sumOfNumber(int n)
    {
        // base condition
        if(n<=1)
        {
            return n;
        }
        return n+ sumOfNumber(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int result=sumOfNumber(n);
        System.out.println("sum of " +n +" number is : "+result);
    }
}
