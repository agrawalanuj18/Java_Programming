public class ExceptionHandling {
    public static void main(String[] args) {

        // Try -Catch in Exception Handling
        int[] marks = { 97, 98, 95 };
        try {
            System.out.println(marks[5]);
        } catch (Exception exception) {
            // do something after catching
            System.out.println("Exception is catched");
        }

        System.out.println(marks[1]);
    }
}
