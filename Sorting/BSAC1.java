/*Q1. Write a program to sort an array in descending order using bubble sort.
Input Array {3,5,1,6,0}
Output Array: {6, 5, 3, 1, 0}// package Sorting;
*/

import java.util.Arrays;
import java.util.Scanner;
class bubbleSort{
    public static void descendingOrder(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        
        {
            boolean swapped=false;
            for(int j=0; j<arr.length-1-i; j++)
            {
                if (arr[j]<arr[j+1]) {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }
      
        
    }
}

public class BSAC1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("taking the input from the user");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        bubbleSort obj=new bubbleSort();

        obj.descendingOrder(arr);
        System.out.println(Arrays.toString(arr));

    }
}
