import java.util.Scanner;
public class Even_odd_number {
    public static void main(String[]args)
    {
        System.out.println("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if (num%2==0)
            System.out.println(num+" is an even number");
        else
            System.out.println(num+" is an odd number");
    }
}
