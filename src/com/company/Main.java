package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");

        int a = scanner.nextInt();
        System.out.println("You entered the number:" + a);
        System.out.println("Enter the second number:");

        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("Resultt:" + c);
    }
}
