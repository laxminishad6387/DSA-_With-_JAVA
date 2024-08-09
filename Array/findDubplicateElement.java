package Array;

import java.util.Scanner;

public class findDubplicateElement {
    public static int DubplicateElementfun(int []arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if (arr[i]==arr[j]) {
                    return arr[i];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("array get the input from the  user");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        int DubplicateElement=DubplicateElementfun(arr);
        System.out.println("dublicate elemnt is :"+ DubplicateElement);
    }
}
