import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        int limit, n1 = 0, n2 = 1, temp, result;
        System.out.println("enter the limit:");
        Scanner sc = new Scanner(System.in);
        limit = sc.nextInt();
        for (int i = 1; i <= limit; i++) {

            System.out.println(n1);
            result = n1 + n2;
            n1 = n2;
            n2 = result;


        }
    }
}
