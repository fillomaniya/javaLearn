package seminar_homework.seminar1;

import java.util.Scanner;

public class task1 {
    /**
     * Вычислить n-ое треугольного число(сумма чисел от 1 до n)
     */
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = number.nextInt();
        System.out.printf("Треугольное число заданного числа: %d\n", triangle(i));
        System.out.printf("Факториал заданного числа: %d\n", factorial(i));

        number.close();
    }

    public static int triangle(int a) {
        return (a * (a + 1)) / 2;
    }

    public static long factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }
}