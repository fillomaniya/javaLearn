package seminar_homework.seminar2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SqlTask1 {

    /**
     * Дана строка sql-запроса "select * from students where ".
     * Сформируйте часть WHERE этого запроса,
     * используя StringBuilder.
     * Данные для фильтрации приведены ниже в виде json строки.
     * Если значение null, то параметр не должен попадать в запрос.
     * Параметры для фильтрации: {"name":"Ivanov",
     * "country":"Russia", "city":"Moscow", "age":"null"}
     */ 

    public static void main(String[] args) {

        split(reader());
    }

    public static String reader() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("seminar_homework/seminar2/Txt1.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = sb.toString();
        return str;

    }

    public static void split(String str) {
        String str2 = str.replace("{", "")
                .replace("}", "")
                .replace("\"", "");
        String[] newStr = str2.split(", ");

        Map<String, String> dictionary = new HashMap<String, String>();
        for (String item : newStr) {
            String[] strnew = item.split(":");
            System.out.println(Arrays.toString(strnew));
            for (int i = 0; i < newStr.length; i++) {
                dictionary.put(strnew[0], strnew[1]);

            }
        }
        StringBuilder WHERE = new StringBuilder();
        Set<Map.Entry<String, String>> pair = dictionary.entrySet();
        List<Map.Entry<String, String>> list = new ArrayList<>(pair);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getValue() == "null") {
                WHERE.append(" ");
            } else 
                WHERE.append(list.get(i).getKey() + " = " + list.get(i).getValue() + ", ");
            // Не получается исключить null, все равно печатается
        }
        System.out.print("SELECT * FROM students WHERE" + " ");
        System.out.print(WHERE);

    }
}
