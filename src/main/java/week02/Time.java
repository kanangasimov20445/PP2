package week02;

import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total seconds: ");
        int total = scanner.nextInt();
        int hours = total / 3600;
        int minutes = (total % 3600) / 60;
        int seconds = total % 60;

        System.out.print(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
        scanner.close();
    }
}