import java.util.Scanner;

public class guess_the_number {
    public static void main(String[] args) {
        int input, count = 0;
        System.out.print("Guess the no. from 0 to 100:");
        int num = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        do {
            input = sc.nextInt();
            if (input < num)
                System.out.println("Your number is to small:");
           else if(input > num)
                System.out.println("Your number is to large:");
            else
                System.out.println("you Guess the right number= " + input);

            count++;
        } while (input != num);
        System.out.println("you guess the right number in " + count + " turn");
    }
}
//n%2==0
