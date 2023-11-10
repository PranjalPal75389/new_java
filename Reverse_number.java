import java.util.Scanner;

public class Reverse_number {
    public static void main(String[]args)
    {
        int remainder,num,reverse=0;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
        while(num!=0)
        {
            remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        System.out.println(reverse+" is your reverse number");
    }
}
