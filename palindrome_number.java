import java.util.Scanner;

public class palindrome_number {
    //reverse no. = original no.
    public static void main(String[]args)
    {   int num,rev=0,rem,original;
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        original = num;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num/=10;

        }
        if(rev==original)
            System.out.println(original +" is a palindrome number");
        else
            System.out.println(original +" is not a palindrome number");
    }
}
