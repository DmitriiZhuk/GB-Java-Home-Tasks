package HomeTask01;
// Реализовать простой калькулятор
import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNum = iScanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = iScanner.nextInt();
        System.out.print("Введите знак (+*-/): ");
        String deistvie = iScanner.next();

        iScanner.close();

        switch (deistvie) {
            case "/": {
                if (secondNum != 0) {
                    System.out.println(firstNum / secondNum);
                } else {
                    System.out.println("Деление на ноль");
                }
            }
            case "*": System.out.println(firstNum * secondNum);
            case "-": System.out.println(firstNum - secondNum);
            case "+": System.out.println(firstNum + secondNum);
            default : System.out.println("Ошибка");

        }
    }
}