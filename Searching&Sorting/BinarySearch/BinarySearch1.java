// package Searching&Sorting.BinarySearch;

import java.util.Scanner;
class targetElement{
    public static int targetElementSearch(int arr[], int target)
    {  int low=0;
        int high=arr.length-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if (target==arr[mid]) {
                return 1;
            }
            else if (arr[mid]>target) {
                high=mid-1;
            } 
            else
            {
                low=mid+1;
            }
        }
        return 0;
         
    }
}

public class BinarySearch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the  array");
        int n=sc.nextInt();
        int  arr[]=new int[n];
        System.out.println("taking the input from the user");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("please choice  the target element");
        int target=sc.nextInt();
        targetElement obj=new targetElement();
        int result=obj.targetElementSearch(arr, target);
        if (result==1) {
            System.out.println("element is found");
        }
        else
        {
            System.out.println("element is not found");
        }

    }
}
