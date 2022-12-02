import java.net.SocketImpl;
import java.util.Scanner;

public class FactorialNum {

    public static void CalculateFact(int n, int i, int Fact) {
        Fact *= i;
        if (n == i) {
            System.out.println(Fact);
            return;
        }
        CalculateFact(n, i + 1, Fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for calculating its factorial:- ");
        int n = sc.nextInt();
        CalculateFact(n, 1, 1);
    }
}