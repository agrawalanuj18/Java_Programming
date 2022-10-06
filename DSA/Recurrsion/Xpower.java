public class Xpower {
    public static int calcPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPownm1 = calcPow(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }
    public static void main(String[] args) {
        // using Stack height = n
        int x = 2;
        int n = 5;

       int ans =  calcPow(x, n);

       System.out.println(ans);
    }
}
