package com.conditional.main;

import java.util.Scanner;

public class TypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Smaller alphabet");
        }
        else {
            System.out.println("Larger Alphabet");
        }
    }
}
