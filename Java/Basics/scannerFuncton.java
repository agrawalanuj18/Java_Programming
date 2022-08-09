import java.util.Scanner;

public class scannerFuncton {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String Name = name.next(); // if we want to take single input
        System.out.println(Name);
        Scanner scanSentence = new Scanner(System.in);
        String Nature = scanSentence.nextLine();// if we want to print sentence
        System.out.println(Nature);

    }
}
