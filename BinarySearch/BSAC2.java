/*Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
not present return -1.
Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
Output 1: 6
Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
Output 2: -1*/

import java.util.Scanner;
class LastOccurace{
    public static int FindLastOccurance(int arr[], int target)
    {
        int low=0, high=arr.length-1;
        int mid, result=-1;
        while (low<=high) {
            mid=low+(high-low)/2;
            if (target==arr[mid]) {
                result=mid;
                low=mid+1;
            }
            else if (target<arr[mid]) {
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

public class BSAC2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thhe size of the array");
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0; i<num; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element");
        int target=sc.nextInt();
        LastOccurace  obj=new LastOccurace();
        int result=obj.FindLastOccurance(arr, target);
        if(result!=-1)
        {
            System.out.println("last occurance  of target element is present in location of : "+ result);
        }
        else
        {
            System.out.println("target element is not present "+result);
        }


    }
}
