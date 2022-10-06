public class XpowerUsingLogn {
    public static int calcPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
       // if n is even
       if(n%2==0){
        return calcPow(x, n/2) * calcPow(x, n/2);
       }
       else{
        // if n is odd
        return calcPow(x, n/2) * calcPow(x, n/2) * x;
    }
    }
    public static void main(String[] args) {
        // using Stack height = n
        int x = 2;
        int n = 5;

       int ans =  calcPow(x, n);

       System.out.println(ans);
    }
}
