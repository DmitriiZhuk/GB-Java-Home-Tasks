    /*
     * Дана строка sql-запроса "select * from students where ".
     * Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для
     * фильтрации приведены ниже в виде json строки.
     * Если значение null, то параметр не должен попадать в запрос.
     */

import java.util.ArrayList;

public class Task01_SQL {
    public static void main(String[] args) {
        String initial = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        getSQLRequest(initial);
    }

    private static void getSQLRequest(String initial) {
        StringBuilder firstPart = new StringBuilder("select * from students where ");

        initial = initial.substring(1, initial.length() - 1);

        String[] params = initial.split(", ");

        ArrayList<String> arrayList = new ArrayList<String>();

        String checkString = "\"null\"";

        for (int i = 0; i < params.length; i++) {

            if (!params[i].contains(checkString)) {
                String prelimString = params[i].replace(":", "=");
                String pair = prelimString.replace("\"", "");
                arrayList.add(pair);
            }

        }

        for (int i = 0; i < arrayList.size(); i++) {
            firstPart.append(arrayList.get(i));

            if (i < (arrayList.size() - 1)) {
                firstPart.append(" AND ");
            }

        }
        System.out.println(firstPart);
    }
}