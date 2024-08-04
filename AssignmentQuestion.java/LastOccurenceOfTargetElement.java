// package AssignmentQuestion.java;

// time complexity=O(logn)
//find the target element of last occourence using binary search method
import java.util.Scanner;

public class LastOccurenceOfTargetElement {
    public static int lastoccurence(int arr[], int target)
    {
        int result=-1;
        int low=0, high=arr.length-1;
        // implemenntation of last occourenece of element
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                result=mid;
                low=mid+1;
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        // store the element in array
        System.out.println("taking the input from the user");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        // target element
        System.out.println("please enter the target element , which unwant to seach in array");
        int target=sc.nextInt();
        int result=lastoccurence(arr, target);
        if (result==-1) {
            System.out.println("element is not found");
        }
        else
        {
            System.out.println("last occurence of target element index is :  "+result);
        }
    }
}
