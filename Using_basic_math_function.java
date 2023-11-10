import java.util.Scanner;

public class Using_basic_math_function {
    public static void main(String[]args)
    {
        int to_do=1,n1,n2;
        System.out.println("Enter two numbers:");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        // using while loop to asking the user what to do
        while(to_do!=0){
        System.out.println("Enter 1 = maximum ,2 = minimum,3 = square root,4 = square");
         to_do =sc.nextInt();
        switch (to_do)
        {
            // 0 for exiting the program
            case 0:
                System.out.println("you exit the Program ");
                break;
            case 1:
                System.out.println(Math.max(n1,n2));
                break;
            case 2:
                System.out.println(Math.min(n1,n2));
                break;
            case 3:
                System.out.println(Math.sqrt(n1));
                System.out.println(Math.sqrt(n2));
                break;
            case 4:
                System.out.println(Math.pow(n1,2));
                System.out.println(Math.pow(n2,2));
                break;
                // if giving warning to the user only to enter number between 0-4 only
            default:
                System.out.println("enter no between 0-4 only");

        }
        }
    }
}
