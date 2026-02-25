import java.time.LocalDate; // 1. Добавляем импорт, как просил наставник

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int year = 2026;
        printIsLeapYear(year);

        // Задача 2
        int osType = 0; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2022;
        recommendApplication(osType, clientDeviceYear);

        // Задача 3
        int deliveryDistance = 95;
        int totalDays = calculateDeliveryDays(deliveryDistance);

        if (totalDays == -1) {
            System.out.println("Свыше 100 км доставки нет.");
        } else {

            System.out.println("Потребуется дней: " + totalDays);
        }
    }

    // Задача 1
    public static void printIsLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // Задача 2
    public static void recommendApplication(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear(); // Используем импортированный класс для получения года

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

    // Задача 3
    public static int calculateDeliveryDays(int distance) {
        if (distance > 100) {
            return -1;
        }

        int deliveryDays = 1;
        if (distance > 20) {
            deliveryDays++;
        }
        if (distance > 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }
}