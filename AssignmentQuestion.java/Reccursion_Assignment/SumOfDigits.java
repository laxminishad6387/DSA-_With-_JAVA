// package Reccursion_Assignment;
/*Q1 : Given an integer, find out the sum of its digits using recursion.
Input: n= 1234
Output: 10
Explanation: 1+2+3+4=10
*/

import java.util.Scanner;

public class SumOfDigits {
    public static int DigitsSum(int num)
    {  int result=0;
        if(num<=9)
        {
            return num;
        }
        else
        {
            result=num%10+DigitsSum(num/10);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enetre the nnumber");
        int num=sc.nextInt();
        
        int result=DigitsSum(num);
        System.out.println("Sum of given number is : "+result);
    }
}
