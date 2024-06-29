/*Q5: Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer
with itself.
Example 1:
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
Example 2:
Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
*/

import java.util.Scanner;
class perfectSquare{
    public static boolean FindPerfectSquare(int num)
    {
        int low=0, high=num;
        int mid , value=0;
        while (low<=high) {
            mid=low+(high-low)/2;
            value=mid*mid;
            if (value==num) {
                return true;
            }
            else if (value<num) {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return false;

    }
}

public class BSAC5 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       
        
perfectSquare obj=new perfectSquare();
boolean result=obj.FindPerfectSquare(num);
System.out.println(result);

    }
}
