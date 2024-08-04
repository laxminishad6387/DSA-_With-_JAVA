import java.util.Scanner;


public class CountNumberOfStairs {
    public static int NumberOfways(int num)
    { int result=0;
        if(num<=2)
        {
            return num;

        }
        else{
            result=NumberOfways(num-1)+NumberOfways(num-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of stairs");
        int num=sc.nextInt();
        int result=NumberOfways(num);
        System.out.println("number of ways is : "+result);
    }
}
