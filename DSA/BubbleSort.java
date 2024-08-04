

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the size of the array");
        int size=sc.nextInt();
    //    create an array
    int arr[]=new int[size];
    System.out.println("taking input from the user");
    for(int i=0; i<arr.length; i++)
    {
        arr[i]=sc.nextInt();
    }
    //bubblem sort implemention is applied
    for(int i=0; i<arr.length; i++)
    {
        for(int j=0; j<arr.length-i-1; j++)
        {
            if (arr[j]>arr[j+1]) {
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
           
        }
    }
    System.out.println("after the sorting");
    for(int i=0; i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }

    }
}
