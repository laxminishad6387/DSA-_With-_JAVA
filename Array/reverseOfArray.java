package Array;

import java.util.Scanner;

public class reverseOfArray {
    public static void reverseOfArrayfun(int []arr)
    {
        int n=arr.length;
        for(int i=0; i<arr.length/2; i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("array get the input from the user");
    for(int i=0; i<arr.length; i++)
    {
        arr[i]=sc.nextInt();
    }
    reverseOfArrayfun(arr);
    for(int i=0; i<arr.length ; i++)
    {
        System.out.print(arr[i]+" ");
    }
   } 
}
