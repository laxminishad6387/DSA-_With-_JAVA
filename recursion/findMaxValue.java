package recursion;

// import java.nio.channels.ScatteringByteChannel;
// import java.security.PublicKey;
import java.util.Scanner;

public class findMaxValue {
    public static int maxValue(int [] arr ,int n,int max)
   { 
          if(n==(arr.length-1))
          {
            return max;
          }
          else{
            if (max<arr[n]) {
                max=arr[n];
            }
            return  maxValue( arr , n+1, max);

          }
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        
        int []arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int result=maxValue(arr,0, max);
        System.out.println("maximum value of this number is : "+result);
    }
}
