package HomeTask01;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class Task0101 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = iScanner.nextInt();
        iScanner.close();

        int nNumber = number * (number + 1) / 2;
        System.out.printf("Произведение чисел от 1 до n равно %d", nNumber);

    }
}