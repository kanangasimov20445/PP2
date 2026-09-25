package week02;

import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        if (n<0){
            System.out.println("No factorial for negative numbers!");
            scanner.close();
            return;
        }
        long r = 1;
        for (int i = 2; i <= n; i++) {
            r *= i;
        }
        System.out.println("Factorial of " + n + " is: " + r);
        scanner.close();
    }
}

