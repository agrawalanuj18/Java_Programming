import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("number is equal to 1");
                break;
            case 2:
                System.out.println("number is equal to 2");
                break;
            default:
                System.out.println("number is neither 2 nor 1");
        }
    }
}
