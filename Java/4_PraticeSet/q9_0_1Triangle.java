public class q9_0_1Triangle {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                int Sum = i + j;
                if (Sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
 // // This give an similar but wrong OUTPUT
        // int k = 1;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(k%2 + " ");
        // k++;
        // }
        // System.out.println();
        // }
       
        // output :-
        // 1
        // 0 1
        // 0 1 0
        // 1 0 1 0
        // 1 0 1 0 1
        
    }
}
