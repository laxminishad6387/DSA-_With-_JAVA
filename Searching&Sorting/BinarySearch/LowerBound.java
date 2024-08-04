/*first occurance of the target element */

// package Searching&Sorting.Bi/narySearch;

import java.util.Scanner;
class lowerBoundElement{
    public static int findfirstOccurence(int arr[], int  target){
      int low=0;
       int high=arr.length-1;
       int mid,result=0;
      
       while (low<=high) {
        mid=low+(high-low)/2;
        if (target==arr[mid]) {
            result=mid;
            high=mid-1;
          
        }
        else if (arr[mid]>target) {
            high=mid-1;
        }
        else
        {
            low=mid+1;
        }
       }
    
       return result;
    }
}

public class LowerBound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("give the  target element which u want to search that");
        int target=sc.nextInt();
        lowerBoundElement obj=new lowerBoundElement();
        int result=obj.findfirstOccurence(arr, target);
       
            System.out.println("first occurance of the target element present in index:  "+ result);
      
    }
}
