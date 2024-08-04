package recursion;

import java.util.Scanner;

public class Array_values_sum {
    public static int sumOfAllValues(int []arr,int n)
    {
        // base condition
        if (n==arr.length-1) {
            return arr[n];
        }
        else
        {
            return sumOfAllValues(arr,n+1)+arr[n];
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the values in array");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int result=sumOfAllValues(arr,0);
        System.out.println("sum of all value of array is : "+result);
    }
}
