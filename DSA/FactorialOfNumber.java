// package DSA;

import java.util.Scanner;

public class FactorialOfNumber {
    // implementration of factorial
    public static int Factorial(int num)
    {  int result=0;
        if(num==0|| num==1)
        {
            return 1;
        }
        else
        {
             result=num*Factorial(num-1);
        }
        return result;
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
       int result= Factorial(num);
       System.out.println("factorial of number is : "+result);
    }
}
