import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=18){
            System.out.println("You can drive");
        }
        else{
            System.out.println("You cannot drive");
        }
    }
}
