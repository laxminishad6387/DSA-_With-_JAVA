// package DSA;

import java.util.Scanner;

public class FibonacciSeries {
    public static int FiboSeriesNumber(int num)
    {
        int result=0;
        if(num==0 ||num==1)
        {
            return num;
            
        }
        else
        {
            result=FiboSeriesNumber(num-1)+FiboSeriesNumber(num-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number");
        int num=sc.nextInt();
        int result=FiboSeriesNumber(num);
        System.out.println("fibonacci series number is : "+result);
    }
}
