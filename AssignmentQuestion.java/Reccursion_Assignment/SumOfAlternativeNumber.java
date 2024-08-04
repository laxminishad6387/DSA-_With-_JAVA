// package Reccursion_Assignment;
/*Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
Constraints : 0<=n<=1e6
Input1 : n = 10
Output 1 : -5
Explanation : 1-2+3-4+5-6+7-8+9-10 = -5
Input 2 : n = 5
Output 2 : 3 */


import java.util.Scanner;

public class SumOfAlternativeNumber {
    
    public static int sumOfNumber(int num)
    {   
       if (num==0) {
          return num;
       }
      
        
           else if (num%2!=0) {
                return sumOfNumber(num-1)+num;
            }
            else
            {
                return sumOfNumber(num-1)-num;
            }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int sum=0;
        int result=sumOfNumber(num);
        System.out.println("sum of alternative number is : "+result);
    }
}
