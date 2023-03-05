import java.io.PrintStream;
import java.util.Locale;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() { // Объявление метода «сгенерироватьМассив»
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray(); //Объвление массива и вызоа метода «сгенерироватьМассив»
        int sum = 0;
        for (int index : arr) {
            sum += index;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray(); //Объвление массива и вызоа метода «сгенерироватьМассив»
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray(); //Объвление массива и вызоа метода «сгенерироватьМассив»
        int sum = 0;
        double average = 0;
        for (int i : arr) {
            sum += i;
            average = (average + sum) / arr.length;
        }
        System.out.printf(Locale.US, "Средняя сумма трат за месяц составила рублей - %.2f%n", average);

    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--)
            System.out.print(reverseFullName[i]);
    }
}