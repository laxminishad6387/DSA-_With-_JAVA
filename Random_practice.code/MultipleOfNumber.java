import java.util.Scanner;

public class MultipleOfNumber {
    public static void  PrintOFMultiple(int a, int k)
    {
        // base case condition
        if(k==0)
        {
         return;
        }
        else
        {      PrintOFMultiple(a,k-1);
              System.out.print(a*k +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a and k");
        int a=sc.nextInt();
        int k=sc.nextInt();
        PrintOFMultiple(a,k);

    }
}
