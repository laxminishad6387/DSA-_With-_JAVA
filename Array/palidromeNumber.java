package Array;

import java.util.Scanner;

public class palidromeNumber {
    public static int palindrome(int []arr)
    {  int size=arr.length;
        int flag=0;
        for(int i=0; i<size/2; i++)
        {
           if (arr[i]!=arr[size-1-i]) {
            flag=1;
           }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("array get the input from the  user");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
       int result= palindrome(arr);
       if (result==0) {
        System.out.println("array is palindrome");
       }
       else
       {
        System.out.println("array is not palidrome");
       }
    }
}
