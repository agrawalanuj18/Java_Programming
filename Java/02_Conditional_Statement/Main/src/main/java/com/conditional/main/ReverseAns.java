package com.conditional.main;
import java.util.Scanner;
public class ReverseAns {
    public static void main(String[] args) {
        System.out.println("Reverse The Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while(number>0){
            int lastDigit = number%10;
            System.out.print(lastDigit);
            number = number/10;
        }
    }
}
