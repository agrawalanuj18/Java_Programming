public class Method_function {

    public static void printJava() {
        System.out.println("Namaste Function");
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void addNum(int a, int b) {
        int Sum = a + b;
        System.out.println(Sum);
    }
    public static void main(String[] args) {

        // Methods/Function in Java
        printJava();
        printJava();

        printName("Aman");
        printName("Akku");

        addNum(10, 20);
        addNum(33, 34);

    }
}
