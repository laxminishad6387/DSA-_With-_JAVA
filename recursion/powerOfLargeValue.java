package recursion;

import java.util.Scanner;

public class powerOfLargeValue {
   
    public static int powerFunction(int a,  int b)
    {   int result=0,finalResult=0,mid=0;
         //base condition
      
        if (b==1) {
            return a;
        }
        //recursive call
        else{
                mid=b/2;
                result=powerFunction(a, mid);
                finalResult=result*result;
            
            if (b%2!=0) {
               return a*finalResult; 
            }
            else
            {
                return finalResult;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        int result=powerFunction(a,b);
         System.out.println(a+" power of "+b +" is : "+result);
    }
}
