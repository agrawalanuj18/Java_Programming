package com.main;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello world!");
        System.out.println("Hello world!");

// Variable in Java
        String firstName = "The";
        String lastName = "Rock";
        int age = 52;
        String fullName = firstName + lastName;
        System.out.println(firstName  + lastName + age);
        System.out.println(fullName);

        String fullName2 = fullName.replace('o','a');
        System.out.println(fullName2);
        System.out.println(fullName2.length());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.charAt(3));



    }
}