package BackTrackingProblem;

import java.util.Scanner;
public class permutaion_problem {
    public static String swap(String str,int i, int j)
    {
        char []charArray=str.toCharArray();
        char temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);
    }
     public static void permute(String str, int l, int r)
     {
        // base condition
        if (l==r) {
            System.out.println(str);
        }
        else
        {
            for(int i=l; i<=r; i++)
            {
                str=swap(str,l,i);
                permute(str, l+1, r);
                str=swap(str,l,i);
            }
        }
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please give the string");
        String str=sc.next();
        System.out.println("given string is "+str);
        int n=str.length();
        permute(str, 0, n-1);
    }
}
