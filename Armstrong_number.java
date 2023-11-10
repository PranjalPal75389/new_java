import java.util.Scanner;

public class Armstrong_number {
public static void main(String[]args)
{
    int temp,rem,arm=0;
    System.out.println("Enter a number with three digit:");
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    temp=num;
    while(num!=0)
    {
        rem=num%10;
        arm=(rem*rem*rem)+arm;
        num/=10;
    }
    if(arm==temp)
        System.out.println(temp+" is an armstrong number");
    else
        System.out.println(temp+" is not an armstrong number");
 }
}
