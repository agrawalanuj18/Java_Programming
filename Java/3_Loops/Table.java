import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int i = 1;
        int table;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (i <= 10) {
            table = num * i;
            System.out.println(table);
            i++;

        }
    }
}
