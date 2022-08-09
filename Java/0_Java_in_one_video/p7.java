import java.util.Arrays;

public class p7 {

    public static void main(String[] args) {
        // Arrays
        // Non-primitive data types
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // length 
        System.out.println(marks.length);

        // Sorting in Java 
        System.out.println("Marks after sorting");
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

    }

}
