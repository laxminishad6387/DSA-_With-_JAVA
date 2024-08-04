
// package AssignmentQuestion.java;
import java.util.*;
import java.io.*;
public class CountTheNumberOfOnes {
    public static int NumberOfOnes(int arr[])
    {  int count=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
        }
        return count;
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
        
        int result=NumberOfOnes(arr);
        if (result==-1) {
            System.out.println("element is not found");
        }
        else
        {
            System.out.println("last occurence of target element index is :  "+result);
        }
    }
}
