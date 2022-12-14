package seminar_homework.seminar4;

import java.util.Scanner;

public class CalcDeleteTask3 {

    /**
     * В калькулятор добавьте возможность отменить последнюю операцию
     */
    public static void main(String[] args) {
        print();
        calcDelete();
    }

    private static void print() {
        System.out.println("Введите первое число: ");
        int num1 = number();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = operation();
        System.out.println("Введите второе число: ");
        int num2 = number();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);
        System.out.println("");
        System.out.println("Чтобы очистить строку, нажмите 'c', выключить - 'off'");
        calcDelete();
    }

    public static int number() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    public static String operation() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;
    }

    public static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;
    }

    public static void calcDelete() {
        Scanner scan = new Scanner(System.in);
        String clean = scan.nextLine();
        switch (clean) {
            case "c":
                System.out.println("0");
                print();
                break;
            case "off":
                break;
            default:
                System.out.println("");
                break;
        }
    }
}

