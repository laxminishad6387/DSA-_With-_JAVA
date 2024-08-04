import java.util.Scanner;


public class FindingOfPower {
    public static int power(int a, int b)
    {
        int mid=0,finalresult=0,result=0;
        if(b==1)
        {
            return a;
        }
        else
        {
            mid=b/2;
            result=power(a, mid);
            finalresult=result*result;
            if(b%2==0)
            {
                return finalresult;
            }
            else
            {
                return finalresult*a;
            }
        }
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
System.out.println("please eneter the value of a and b");
int a=sc.nextInt();
int b=sc.nextInt();
int result=power(a,b);
System.out.println("power  of a^b is : "+result);
}
    
}









// // time complexity=O(n)
// // space complexity=O(n)

// public class FindingOfPower {
//     public static int power(int a, int b)
//     {  int result=0;
//         if (b==0) {
//             return 1;
//         }
//         else 
//         {
//              result=a*power(a, b-1);
//         }
//         return result;

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("please enter the number");
//         int a=sc.nextInt();
//         System.out.println("please enter the second number");
//         int b=sc.nextInt();
//         int result=power(a,b);
//         System.out.println("power is :" +result);
//     }
// }
