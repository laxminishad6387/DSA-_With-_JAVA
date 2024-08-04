// package Random_practice.code;

import java.util.Scanner;

public class ShuffleOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int n=size*2;
        int arr[]=new int[n];
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("variable of x");
       
    }
}
