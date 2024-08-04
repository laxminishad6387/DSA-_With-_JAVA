// package recursion;

import java.util.Scanner;

// import recursion.power;
import java.util.*;
public class armStrongNumber {
    public static int power(int a, int b)
    {  int result=0, finalResult=0;
        System.out.println("enter in power function");
        // base  condition
        if(b==1)
        {
            return a;
        }
        if(b==0)
        {
            return 1;
        }
        // recusrive call
        else{
             result=power(a, b/2);
          finalResult=result*result;
             if (b%2==0) {
                System.out.println(finalResult);
                return finalResult;
             }
             else
             {
                System.out.println(finalResult);
             return finalResult*a;
             }
        }

    }
    public static int  checkNumber(int n, int count)
    {  //double power=0;
        // base case
        if (n<=0) {
            return  0;
        } 
        // recursive  call
        else{
            int m=n%10;
            System.out.println("check nummber");
           int  result=power(m,count)+checkNumber(n/10, count);
           return result;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int count=0;
        while (n>0) {
            count++;
            n=n/10;
           
        }
      
        System.out.println("total length is : "+count);
        int result=checkNumber(n, count);
        System.out.println(result);

        
    }
}
