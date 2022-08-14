import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Sum =0;
        for (int i = 1; i <= num; i++) {
            Sum += i;
        }
        System.out.println(Sum);
    }
}
