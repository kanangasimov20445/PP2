package week02;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();

        System.out.print("Choose the operation (+, -, *, /, %): ");
        char c = scanner.next().charAt(0);
        int r = 0;

        if (c == '+') {
            r = a + b;
        } else if (c == '-') {
            r = a - b;
        } else if (c == '*') {
            r = a * b;
        } else if (c == '/') {
            r = a / b;
        } else if (c == '%') {
            r = a % b;
        } else {
            System.out.println("Invalid input");
        }

        System.out.println("The result is: " + r);
        scanner.close();
    }
}