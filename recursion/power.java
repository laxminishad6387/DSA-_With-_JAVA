package recursion;

import java.util.Scanner;

public class power {
    public static int powerFunction(int a, int b)
    {
        // base  condition
        if (b==1) {
           return a; 
        }
        if (b==0) {
            return 1; 
         }
        //  recursive function
        else{
            return a*powerFunction(a, b-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a=sc.nextInt();
        System.out.println("enter the value of b ");
        int b=sc.nextInt();
       int result= powerFunction(a,b);
       System.out.println(a+" power of "+b +" is : "+result);
    }
}
