/*Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
else print “Element not found in array”. Input the size of array, array from user and the element X from user.
Use Linear Search to find the element.
Example1  

Example 2*/


import java.util.Scanner;
// search element using binary search method
// if  given array in sorted order
// time complexity=O(logn)

public class SearchTheElement {
    public static int search(int arr[], int target)
    {  int low=0,high=arr.length-1;
        while (low<=high) {
            
        
         int mid=low+(high-low)/2;
        if (arr[mid]==target) {
            return mid;
        }
        else if (arr[mid]>target) {
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return -1;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    // store the element in an array
    System.out.println("taking the innput from the user");
    for(int i=0; i<arr.length; i++)
    {
        arr[i]=sc.nextInt();
    }
    // taking the target element from the user
    System.out.println("please enter the target element , which u want to search in an array");
    int target=sc.nextInt();
    int result=search(arr, target);
    if (result==-1) {
        System.out.println("element is not fount");
    }
    else{
        System.out.println("element found at index of : "+result);
    }
}
    
}

















// search element using linear search
// time complexity=>O(n)

// public class SearchTheElement {
//     public static int Search(int arr[], int target)
//     {
//         int index=-1;
//         for(int i=0; i<arr.length ; i++)
//         {
//             if(arr[i]==target)
//             {
//                 index=i;
//                 return index;
//             }
//         }
//         return index;
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size of the array");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("taking the input from the user");
//         for(int i=0; i<arr.length; i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("please enter the target element , which u  want to search in an array");
//         int target=sc.nextInt();
//         // function call
//        int result= Search(arr,target);
//        if (result==-1) {
//         System.out.println("element is  not founnd");
//        }
//        else
//        {
//         System.out.println("element is found at the index of "+ result);
//        }

//     }
// }
























// search element using linear search
// time complexity=>O(n)
// public class SearchTheElement {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size of an array");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         // store the element in an array
//         System.out.println("taking the input from the user");
//         for(int i=0; i<arr.length; i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("please enter the target element , which u  want to search in an array");
//         int target=sc.nextInt();
//         int index=-1;
//         for(int i=0; i<arr.length; i++)
//         {
//             if(arr[i]==target)
//             {
//                 index=i;
//                 break;
//             }
//         }
//         if (index==-1) {
//             System.out.println("element is not found");
//         }
//         else
//         {
            
//             System.out.println("element is found at the index of : "+index);
//         }
//     }
// }
