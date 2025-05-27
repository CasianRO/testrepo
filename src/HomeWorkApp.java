public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Программа запущена");
        printThreeWords();    // Вызов 1-го метода
        checkSumSign();       // Вызов 2-го метода
        printColor();         // Вызов 3-го метода
        compareNumbers();     // Вызов 4-го метода

        boolean result = isSumBetween10And20(7, 8);
        System.out.println("Сумма между 10 и 20? " + result);

        // Вызов нового метода:
        printNumberSign(5);
        printNumberSign(-3);
        printNumberSign(0);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -10;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 42; // Можно поменять на любое число

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;  // можно менять значения
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // Вот новый метод:
    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println(number + " — положительное число");
        } else {
            System.out.println(number + " — отрицательное число");
        }
    }
}









