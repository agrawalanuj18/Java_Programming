public class p8 {
    public static void main(String[] args) {
        // If we know the values of Array and String
        // then we do not need to use new keyword to intialise it

        int[] marks = { 95, 99, 98 };
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // 2D Arrays
        System.out.println("2D Array");
        
        int[][] finalMarks = { { 97, 98, 95 }, { 96, 94, 87 } };
        System.out.println(finalMarks[0][0]);
        System.out.println(finalMarks[1][1]);
        System.out.println(finalMarks[0][2]);

    }
}
