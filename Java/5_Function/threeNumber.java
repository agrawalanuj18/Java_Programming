import java.util.Scanner;

public class threeNumber {

    public static int multiplyTwo(int a, int b) {
        int Multiply = a * b;
        return Multiply;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
      int result = multiplyTwo(a, b);
        System.out.println( result);
    }
}
