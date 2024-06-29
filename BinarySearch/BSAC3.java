/*Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.
Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
Output 1: 6
Input 2: arr = [ 0 0 0 0 0 1 1]
Output 2: 2
*/

import java.util.Scanner;
class Search{
    public static int NumberOfOnes(int arr[])
    {
        int low=0, high=arr.length-1;
        int result=0, mid;
        while (low<=high) {
            mid=low+(high-low)/2;
            if (arr[mid]==1) {
                result=mid;
                high=mid-1;
            }
            else if (arr[mid]<1) {
                low=mid+1;
            }
        }
        return arr.length-result;
    }
}

public class BSAC3 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array");
    int num=sc.nextInt();
    int arr[]=new int[num];
    for(int i=0;  i<num; i++)
    {
        arr[i]=sc.nextInt();
    }
 Search obj=new Search();
 int result=obj.NumberOfOnes(arr);
 System.out.println("number of ones present in the array is : "+result);
   
   } 
}
