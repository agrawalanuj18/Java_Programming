public class FibonacciSeq {

    public static void printFib(int a, int b, int n, int i) {
        int c = a + b;
        // Base Condition
        if (i == n - 2) {
            System.out.print(c + " ");
            return;
        }
        System.out.print(c + " ");
        i++;
        printFib(b, c, n, i);
    }
    public static void main(String[] args) {
        // 1st term = 0
        // 2nd tenm = 1
        // Work = To create the next term
        // c = a + b
        // Base Case nth term

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        printFib(0, 1, 7, 1);

    }
}