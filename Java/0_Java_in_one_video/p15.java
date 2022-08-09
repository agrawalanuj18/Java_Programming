import java.util.Scanner;

public class p15 {
    public static void main(String[] args) {
        // Conditional statement

        System.out.println("Enter Your Cash Value");
        Scanner sc  = new Scanner(System.in);
        // pen = 10rs; notebook = 40rs
        int cash = sc.nextInt();
        if (cash < 10) {
            System.out.println("Cannot buy anything");
            System.out.println("Get more Cash");
        } else if(cash>=10 && cash<=50) {
            System.out.println("You can get one thing");
        }
        else{
            System.out.println("can get both");
        }
    }
}
