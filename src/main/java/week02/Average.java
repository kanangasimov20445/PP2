package week02;

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while (scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
            count++;
        }
        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Average is : " + (sum / count));
        }
        scanner.close();
    }
}