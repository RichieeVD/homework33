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
}