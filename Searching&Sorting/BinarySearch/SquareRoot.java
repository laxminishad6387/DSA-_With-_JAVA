// package Searching&Sorting.BinarySearch;

import java.util.Scanner;

class SquareRootelement{
    public static int findsquarerootelement(int num)
    {
        int arr[]=new int[num];
      
        
        int low=0, high=num;
        int mid, value, result=-1;
        while (low<=high) {
            mid=low+(high-low)/2;
            value=mid*mid; 
             if(value==num)
             {
                return mid;
             }
            else if (value<num) {
               result=mid;
               low=mid+1;

            }
            else  {
                high=mid-1;

            }

        }
        return result;

    }
}
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number which u want to find out the square root");
        int num=sc.nextInt();
        SquareRootelement obj=new SquareRootelement();
        int result=obj.findsquarerootelement(num);
        System.out.println("square root of the number is : "+result);
    }
}
