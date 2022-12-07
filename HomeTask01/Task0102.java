package HomeTask01;
// Вывести все простые числа от 1 до 1000

import java.util.Scanner;

public class Task0102 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите  число: ");
        int number = iScanner.nextInt();
        iScanner.close();

        int i, j;

        for (i = 2; i < number; i++) {
            int k = 0;

            for (j = 2; j <= i; j++) {
                if ((i % j) == 0)
                    k++;
            }
            if (k < 2)
                System.out.println(i);
        }
    }
}
