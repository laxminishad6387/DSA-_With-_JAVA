import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the size of the array");
        int size=sc.nextInt();
      int arr[]=new int[size];
System.out.println("taking input from the user");
for(int i=0; i<size;  i++)
{
    arr[i]=sc.nextInt();
}
//implentaion using selection sort
System.out.println("sorting is applying");
int j=0;
for(int i=1; i<arr.length; i++)
{
    j=i;
    while (j>0 && arr[j]>arr[j-1]) {
       
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
    }
    

for(int i=0; i<arr.length; i++)
{
    System.out.print(arr[i]+" ");
}
    }
}
