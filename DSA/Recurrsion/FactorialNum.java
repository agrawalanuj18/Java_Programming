public class FactorialNum {

    public static void CalculateFact(int n, int i, int Fact) {
        Fact *= i;
        if (n == i) {
            System.out.println(Fact);
            return;
        }
        CalculateFact(n, i + 1, Fact);
    }

    public static void main(String[] args) {
        CalculateFact(5, 1, 1);
    }
}
