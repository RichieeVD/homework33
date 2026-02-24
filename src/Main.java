public class Main {
    // Задача 1
    public static void main(String[] args) {
        int year = 2026;
        printIsLeapYear(year);
    }

    public static void printIsLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // Задача 2
    public static void recommendApplication(int osType, int deviceYear) {
        int currentYear = 2021;

        if (osType == 0 && deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (osType == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (osType == 1 && deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (osType == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
}