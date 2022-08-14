import java.util.Scanner;

public class arrayTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arrayTwo = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arrayTwo[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
               System.out.println( arrayTwo[i][j]);
            }
        }
    }
}
