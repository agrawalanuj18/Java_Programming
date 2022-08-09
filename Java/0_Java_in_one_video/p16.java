import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        // Switch case Statement

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        switch (numb) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            default:
                System.out.println("Number is greather than 2");
                break;
        }

    }
}
