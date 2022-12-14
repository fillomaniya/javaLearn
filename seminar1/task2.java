package seminar_homework.seminar1;

public class task2 {
/**
 * Вывести все простые числа от 1 до 1000
 */
    public static void main(String[] args) {
        int number = 1000;
        boolean b = true;
        for (int P = 2; P <= number; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(P);
            else b = true;
        }
    } 
}
