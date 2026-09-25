package week02;

import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        n = Math.abs(n);

        int sum = 0;
        int product = 1;
        int count = 0;
        if (n == 0) {
            sum = 0;
            product = 0;
            count = 1;
        } else {
            while (n > 0) {
                int digit = n % 10;
                sum += digit;
                product *= digit;
                count++;
                n /= 10;
            }
        }
        double average = (double) sum / count;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        scanner.close();
    }
}