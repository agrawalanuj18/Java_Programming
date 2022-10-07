package com.conditional.main;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "Mango" -> System.out.println("You are King");
            case "Apple" -> System.out.println("You are Apple");
            default -> System.out.println("You are other than Mango and Apple");
        }
    }
}
