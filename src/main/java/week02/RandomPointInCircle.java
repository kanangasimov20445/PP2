package week02;

import java.util.Scanner;
import java.util.Random;
public class RandomPointInCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The number of points to generate: ");
        int n = scanner.nextInt();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            double angle = random.nextDouble() * 2 * Math.PI;
            double r = Math.sqrt(random.nextDouble());

            double x = r * Math.cos(angle);
            double y = r * Math.sin(angle);

            System.out.println("( " + x + ", " + y + " )");
        }

        scanner.close();
    }
}