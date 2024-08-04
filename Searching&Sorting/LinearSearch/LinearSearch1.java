// package Searching&Sorting.LinearSearch;
  // package Searching&Sorting;

  import java.util.Scanner;

public class LinearSearch1 {
  

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("taking the array input from the user");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("please enter the target element");
        int target=sc.nextInt();
        int flag=-1;
        for(int i=0; i<arr.length; i++)
        {
            if (arr[i]==target) {
                flag=1;
            }
        }
        if (flag==1) {
            System.out.println("target element inside the array");
        }
        else
        {
            System.out.println("target element is not found");
        }
    
    }
}

