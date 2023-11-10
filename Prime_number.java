import java.util.Scanner;

public class Prime_number {
    public static void main(String[]args)
    {
        int count=0,i,num;
        System.out.println("Enter a number:");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if (num%i==0)
                count++;
        } if(count==2)
        System.out.println(num+" is an prime number");
        else
        System.out.println(num+" is not an prime number");
    }
}
