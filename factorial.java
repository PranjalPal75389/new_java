import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact = 1;
        System.out.println("enter a number to know its factorial:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i > 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact + " is the factorial of " + num);
    }
}
