// package Reccursion_Assignment;
/*Q3: Print the max value of the array [ 13, 1, -3, 22, 5]. */

import java.util.Scanner;

public class MaxValue {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("please enter array element");
        // taking input from the user
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }
        // function call
        int result =MaximumElement(arr);
        System.out.println("maximum value of an array is : "+result);
    }
}
