public class q2 {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;
        for (int i = 1; i <= n; i++) {

            if (i == 1 || i == n) {
                for (int j = 1; j <= m; j++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k <= m; k++) {
                    if (k == 1 || k == m) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
            }

            System.out.println();
        }
    }
}
