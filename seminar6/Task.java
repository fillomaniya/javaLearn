package seminar_homework.seminar6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Macbook Pro", "8", "1000", "Mac OS", "grey");
        Laptop laptop2 = new Laptop("Acer", "4", "500", "Windows", "black");
        Laptop laptop3 = new Laptop("Asus", "8", "1000", "Windows", "white");
        Laptop laptop4 = new Laptop("HP", "4", "750", "Windows", "black");
        Laptop laptop5 = new Laptop("Macbook Air", "8", "1000", "Mac OS", "silver");

        Set<Laptop> laptops = new HashSet<>(List.of(laptop1, laptop2,
                laptop3, laptop4, laptop5));

        Map<String, String> sel = selectCriteria();
        sort(sel, laptops);

    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        return scan;
    }

    public static Map<String, String> selectCriteria() {
        Map<String, String> resultCriteria = new HashMap<>();
        while (true) {
            System.out.println("Для выбора критерия нажмите '1', если хотите закончить, нажмите '2'");
            String question = scanner();
            if (question.equals("2")) {
                break;
            } else {

                System.out.println(
                        "Введите цифру, соответствующую необходимому критерию: \n 1 - Название \n 2 - ОЗУ \n 3 - Объем ЖД \n 4 - Операционная система \n 5 - Цвет");
                String key = scanner();
                System.out.println("Введите значения для выбранного критерия: ");
                String value = scanner();

                resultCriteria.put(key, value);
            }
        }
        System.out.println(resultCriteria);
        return resultCriteria;

    }

    public static void sort(Map<String, String> criteria, Set<Laptop> laptops) {

        Set<Laptop> temp = new HashSet<>(laptops);
        for (Laptop laptop : laptops) {

            for (Object pair : criteria.keySet()) {

                if (pair.equals("1") && !laptop.getName().equals(criteria.get(pair))) {
                    temp.remove(laptop);
                }
                for (Object pair1 : criteria.keySet()) {

                    if (pair1.equals("2") && !laptop.getRam().equals(criteria.get(pair1))) {
                        temp.remove(laptop);

                    }
                    for (Object pair2 : criteria.keySet()) {

                        if (pair2.equals("3") && !laptop.getDisk().equals(criteria.get(pair2))) {
                            temp.remove(laptop);

                        }
                        for (Object pair3 : criteria.keySet()) {

                            if (pair3.equals("4") && !laptop.getSystem().equals(criteria.get(pair3))) {
                                temp.remove(laptop);

                            }
                            for (Object pair4 : criteria.keySet()) {

                                if (pair4.equals("5") && !laptop.getColor().equals(criteria.get(pair4))) {
                                    temp.remove(laptop);

                                }
                            }
                        }
                    }
                }
            }

        }
        if (temp.isEmpty()) {
            System.out.println("По введенным критериям ничего не найдено!");
        } else {
            System.out.println("Вот, что мы можем предложить: \n" + temp.toString());
        }

    }

}