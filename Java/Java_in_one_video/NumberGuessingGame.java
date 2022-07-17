import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        int ans = (int) (Math.random() * 100);

        int guessNum;
        do {

            System.out.println("Enter Your Guess No. between 1-100");
            Scanner sc = new Scanner(System.in);
            guessNum = sc.nextInt();

            if (guessNum == ans) {
                System.out.println("You win");
                break;
            } else if (guessNum < ans) {
                System.out.println("Your Guess Number is Low");
            } else {
                System.out.println("Your Guess Number is High");
            }
        } while (guessNum >= 0);
        System.out.print("My number was: ");
        System.out.println(ans);
    }
}
