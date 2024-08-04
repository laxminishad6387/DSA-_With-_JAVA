package recursion;

import java.util.Scanner;

public class Sum_of_alternate_sign {
    public static int sumOfAlternateSigns(int n)
    {
        // int result=0;
         if (n<=1) {
            return n;
         }
         else
         {
            return sumOfAlternateSigns(n-1)+(n%2==0?-n:n);
         }
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int result=sumOfAlternateSigns(n);
        System.out.println("sum of alternate number "+n+" is : "+result);
    }
}
