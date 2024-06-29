/*Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element
is not found in the array, report that as well.
Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
target = 5
Output: Target 5 occurs 3 times
Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
target = 6
Output: Target 6 occurs 2 times
*/

import java.util.Scanner;
class duplicateNumber{
    public static int LastOccurance(int arr[], int target)
    {
         //logic-> last occurance of the element
         int left=0, right=arr.length-1;
         int midL,resultL=0;
         while (left<=right) {
             midL=left+(right-left)/2;
             if (arr[midL]==target) {
                resultL=midL;
                left=midL+1; 
             }
             else if (arr[midL]>target) {
                 right=midL-1;
             }
             else
             {
                 left=midL+1;
             }
         }
         return resultL;
    }
  
    public static int FirstOccurance(int arr[], int target)
    {
           int low=0, high=arr.length-1;
           int result=0, mid;
        
        //  logic ->first occurance of the target element
           while (low<=high) {
            mid=low+(high-low)/2;
            if (arr[mid]==target) {
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

public class BSAC4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of  the  array");
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0; i<num; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element");
        int target=sc.nextInt();
        duplicateNumber obj=new duplicateNumber();
        int result1=obj.FirstOccurance(arr, target);
        int result2=obj.LastOccurance(arr, target);
        System.out.println(result2-result1+1);

    }
}
