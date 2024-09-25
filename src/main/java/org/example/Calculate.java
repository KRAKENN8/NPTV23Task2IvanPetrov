package org.example;

import java.util.Scanner;

public class Calculate {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехзначное число");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int sum = 0;
            sum += number % 10;
            number /= 10;
            sum += number % 10;
            number /= 10;
            sum += number;

            // Output the result
            System.out.println("Сумма: " + sum);
        } else {
            System.out.println("Error.");
            scanner.close();
        }
    }
}