import java.util.Scanner;

public class Swap_numbers {
    public static void main(String[]args)
    {
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
// without the third variable
//        n1=n1+n2;
//        n2=n1-n2;
//        n1=n1-n2;

// with the third variable
int temp=n1;
n1=n2;
n2=temp;
        System.out.println(n1);
        System.out.println(n2);
    }
}
