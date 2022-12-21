//1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.*;

public class Task01_Phone {
    public static void main(String[] args) {
        Map<String, String> TelSpr = new HashMap<>();
        TelSpr.putIfAbsent("Иванов", "100");
        TelSpr.put("Петров", "200");
        TelSpr.put("Сидоров", "300");
        TelSpr.put("Скворцов", "400, 500");
        TelSpr.put("Удальцов", "600, 700");
        TelSpr.put("Огольцов", "800, 750");
        TelSpr.put("Молодцов", "900, 1750");
        System.out.println(TelSpr);
        System.out.println();

        //Добавление новой записи - по аналогии с тем что выше
        TelSpr.put("Карлсон", "1850");
        TelSpr.put("Свантесон", "1950");
        System.out.println(TelSpr);
        System.out.println();

        // Удаление пары ключ значение - по ключу
        TelSpr.remove("Свантесон");
        System.out.println(TelSpr);
    }
}
