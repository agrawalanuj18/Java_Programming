import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        // How to take input
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age);

        // String Input
        // Single Word
        Scanner Name = new Scanner(System.in);
        System.out.println("Enter the Name");
        String Character = Name.next();
        System.out.println(Character);

        // Sentence

        Scanner Sentence = new Scanner(System.in);
        System.out.println("Enter the Characteristic:");

        String characteristc = Sentence.nextLine();
        System.out.println(characteristc);
    }
}
