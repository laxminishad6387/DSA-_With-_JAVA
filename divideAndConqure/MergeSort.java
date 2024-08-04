package divideAndConqure;

import java.util.Scanner;

public class MergeSort {
    public static void mergeProcedure(int []arr, int i, int mid, int j)
    {
        // size of left subarray
        int n1=mid-i+1;
        // size of right subarray
        int n2=j-(mid+1)+1;

      //create two subarray for storing of left side element and right side of element
    //   left side array
      int leftSubarray[]=new int[n1];
    //   right side array
    int rightSubaaray[]=new int[n2];

    // left sub array
    for(int i1=0; i1<n1; i1++)
    {
        leftSubarray[i1]=arr[i+i1];
    }
    // right subarray
    for(int i1=0; i1<n2; i1++)
    {
        rightSubaaray[i1]=arr[mid+1+i1];
    }

    int i1=0; 
    int j1=0; 
    int k=i;
    while (i1<n1 && j1<n2) {
        // if left side array is small or equal as compare to right side of element
        if (leftSubarray[i1]<=rightSubaaray[j1]) {
            arr[k]=leftSubarray[i1];
            i1++;
        }
        // if right side of array is small as compare to left side of array
        else
        {
            arr[k]=rightSubaaray[j1];
            j1++;  
        }
        // update the index of original array
        k++;
    }

    // if left side of pointer does not rech to ending point,then simply copy all the element of lleft side of array in original array
    while (i1<n1) {
        arr[k]=leftSubarray[i1];
        i1++;
        k++;
    }

    // if right side of pointer does not rech to ending point,then simply copy all the element of right side of array in original array
    while (j1<n2) {
        arr[k]=rightSubaaray[j1];
        j1++;
        k++;
    }

    }
    public static void mergeSort(int[]arr, int i, int j)
    {
        // base condition
        // if(i==j)
        // {
        //     return arr[i];
        // }
        // recursive condition
  if (i<j) {
    
  
       
            // divide the  array into two  subarray
            int mid=i+(j-i)/2;
            // left subarry is
            mergeSort(arr, i, mid);
            // right subarray
            mergeSort(arr, mid+1, j);
            // call merge prosedure function for  sorting of subarray
            mergeProcedure(arr, i, mid,j);

  }
  
       
    }
    public static void display(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
       
        int arr[]=new int[n];

        System.out.println("enter the  element in the array");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("array before applying sorting algorithm");
        display(arr);
        mergeSort(arr,0,n-1);
        System.out.println();
        System.out.println("array after applying sorting algorithm");
        display(arr);
    }
}
