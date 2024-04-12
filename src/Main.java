import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        int year = 2021;
        checkYear(year);


        // Задача 2
        System.out.println("Задача 2");

        int clientOS = 1;
        int clientDeviceYear = LocalDate.now().getYear();

        checkInstallation(clientOS, clientDeviceYear);



        // Задача 3
        System.out.println("Задача 3");

        int deliveryDistance = 95;

        calculationDelivery(deliveryDistance);
    }
    public static void checkYear(int yearTest) {
        if (yearTest % 4 == 0 && yearTest % 100 != 0 || yearTest % 400 == 0) {
            System.out.println(yearTest + " год является высокосным");
        } else {
            System.out.println(yearTest + " год не является высокосным");
        }
    }

    public static void checkInstallation(int os, int deviceYear) {
        if (os == 0) {
            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        if (os == 1) {
            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void calculationDelivery(int distance) {
        int day = 1;
        if (distance < 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (distance >= 20 && distance < 60) {
            day++;
            System.out.println("Потребуется дней: " + day);
        } else if (distance >= 60 && distance < 100) {
            day += 2;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Доставки нет");
        }
    }
}