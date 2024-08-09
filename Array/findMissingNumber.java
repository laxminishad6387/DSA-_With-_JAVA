package Array;

import java.util.Scanner;

public class findMissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the isze of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("array get the input from the user");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        int sumOfNaturalNumber=(n+1)*(n+2)/2;
        int sumOfArray=0;
        for(int i=0; i<arr.length; i++)
        {
            sumOfArray=sumOfArray+arr[i];
        }
        int result=sumOfNaturalNumber-sumOfArray;

        System.out.println("missing element is : "+result);
    }
}
