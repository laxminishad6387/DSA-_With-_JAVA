package recursion;

import java.util.Scanner;

public class fibonaci_Series {
    public static int fibonaciNumber(int n)
    {
        // base condition
        if(n<=1)
        {
            return n;
        }
        // recusive call
        else{
            return fibonaciNumber(n-1)+fibonaciNumber(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter the number");
        int n=sc.nextInt();
        int result=fibonaciNumber(n);
        System.out.println("fibonaci series value is : "+result);
    }
}
