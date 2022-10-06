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

        PrintSum(10, 0, 1);
    }
}
