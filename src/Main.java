import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // 1. Операции с целыми числами
        // ==========================================
        System.out.println("=== Задача 1: Ввод и обработка целых чисел ===");
        try {
            System.out.print("Введите целое число a: ");
            int a = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Введите целое число b: ");
            int b = Integer.parseInt(scanner.nextLine().trim());

            // Сравнение чисел
            if (a > b) {
                System.out.println("Результат сравнения: a > b");
            } else if (a < b) {
                System.out.println("Результат сравнения: a < b");
            } else {
                System.out.println("Результат сравнения: a = b");
            }

            // Математические операции
            System.out.println("Сложение (a + b) = " + (a + b));
            System.out.println("Вычитание (a - b) = " + (a - b));
            System.out.println("Умножение (a * b) = " + (a * b));
            
            // Проверка деления на ноль
            if (b != 0) {
                // Приведение к double, чтобы результат деления был точным (например, 5 / 2 = 2.5)
                System.out.println("Деление (a / b) = " + ((double) a / b));
            } else {
                System.out.println("Деление (a / b): Ошибка! Деление на ноль невозможно.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введены некорректные данные. Ожидались целые числа.");
        }

        // ==========================================
        // 2. Сравнение строк
        // ==========================================
        System.out.println("\n=== Задача 2: Ввод и сравнение строк ===");
        System.out.print("Введите первую строку (a): ");
        String strA = scanner.nextLine();
        System.out.print("Введите вторую строку (b): ");
        String strB = scanner.nextLine();

        // Правильное сравнение строк в Java через .equals()
        if (strA.equals(strB)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        // ==========================================
        // 3. Вывод чётных чисел из массива
        // ==========================================
        System.out.println("\n=== Задача 3: Вывод чётных чисел из массива ===");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.print("Чётные числа: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Перенос строки

        scanner.close();
    }
}
