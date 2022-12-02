import java.util.Scanner;

public class NaturalNumSum {
    public static void PrintSum(int n, int Sum, int j) {
        Sum += j;
        if (j == n) {
            System.out.println(Sum);
            return;
        }
        PrintSum(n, Sum, j + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = sc.nextInt();
        sc.close();
        PrintSum(n, 0, 1);
    }
}
