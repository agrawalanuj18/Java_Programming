public class q5duamondPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // starting spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                
                System.out.print("*");
            }
            
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            // starting spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
