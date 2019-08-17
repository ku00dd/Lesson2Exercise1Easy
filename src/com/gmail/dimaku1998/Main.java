package com.gmail.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer number a = ");
        int a = sc.nextInt();
        System.out.print(" b = ");
        int b = sc.nextInt();
        System.out.print(" c = ");
        int c = sc.nextInt();
        System.out.print(" d = ");
        int d = sc.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        System.out.println(" Max integer number = " + max);
    }
}
