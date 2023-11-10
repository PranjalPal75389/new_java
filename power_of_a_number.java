import java.util.Scanner;

public class power_of_a_number {
    public static void main(String[]args)
    {
        int i,num;
        System.out.println("Enter the size/subscript of the array:");
         Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
         int arr[]=new int[num];
         for (i=0;i<num;i++)
         {
             arr[i]=sc.nextInt();
         }
         for(i=0;i<num;i++)
        System.out.println(arr[i]);
    }
}
