package com.example.function;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Sum(a, b);

    }

    static void Sum(int a, int b) {
       int sum = a + b;
        System.out.println(sum);
    }
}
