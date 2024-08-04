
import java.util.*;
import java.io.*;



public class SquareRootProblem {
    public static int squareroot(int arr[],int num)
    { int low=0; 
        int high=arr.length-1;
       
        int result=-1;
        System.out.println("impleament the square root funtion");
        while (low<=high) {
           
            int mid=low+(high-low)/2;
            int val=mid*mid;
            
        
        if(val==num)
        {
            return mid;
        }
       else if (val>num) {
            high=mid-1;
        }
        else 
        {
             result=mid;
            low=mid+1;
        }
    }
    return result;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("print the number, which u want to find the sqaure root");
    int num=sc.nextInt();
    int num1=num+1;
    System.out.println("declare an array");
    int arr[]=new int[num1];
    System.out.println("store the value an array");
    for(int i=0; i<num1; i++)
    {
        arr[i]=i;
    }
    System.out.println("function call ");
    int result=squareroot(arr,num);
    System.out.println("square root is : "+result);

}
    
}