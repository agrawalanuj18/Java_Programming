import java.util.Scanner;


public class twoNumSum {
public static void sumTwo(int a, int b) {
    int Sum = a + b;
    System.out.println(Sum);
    return;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sumTwo(a, b);
    }
}
