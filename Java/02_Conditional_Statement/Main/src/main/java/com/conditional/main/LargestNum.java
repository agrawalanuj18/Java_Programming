package com.conditional.main;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Find the Greatest Number

//       if (a>b && a>c){
//           System.out.println("a is largest");
//       } else if (b>a && b >c) {
//           System.out.println("b is largest");
//       }
//       else {
//           System.out.println("c is largest");
//       }

        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max);

    }
}
