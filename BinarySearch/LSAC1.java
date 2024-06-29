// package BinarySearch&LinearSearch;
/*Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
else print “Element not found in array”. Input the size of array, array from user and the element X from user.
Use Linear Search to find the element.*/

import java.util.Scanner;
 class LinearSearch{
    public static int findTargetElement(int arr[], int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
 }
public class LSAC1 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the  size of the  array");
    int num=sc.nextInt();
    int arr[]=new int[num];
    System.out.println("taking the input from the user");
    for(int i=0; i<num; i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("take the  target  element input from the user");
    int target=sc.nextInt();
    LinearSearch obj=new LinearSearch();
   int result= obj.findTargetElement(arr, target);
   if(result!=-1)
   {
    System.out.println("target element present in the index of array is : "+ result);
   }
   else{
    System.out.println("target element is not present inside the array");
   }

   } 
}
