public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {

        /**Задача 1
         У банка появилось мобильное приложение. Поэтому теперь, когда пользователь заходит на сайт с телефона, ему предлагается
         скачать приложение с учетом того, какая операционная система у пользователя.
         Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее сообщение:
         Для iOS — «Установите версию приложения для iOS по ссылке».
         Для Android — «Установите версию приложения для Android по ссылке».
         Объявите переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android). */

        System.out.println("\nЗадача_1:");

        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static void task2() {

        /**Задача 2
         Усложним предыдущую задачу. Теперь нам нужно знать не только операционную систему телефона, но и год его создания.
         Ваша задача — написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий.
         Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии:
         Для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
         Для Android: «Установите облегченную версию приложения для Android по ссылке».
         Для пользователей телефонов 2015 года выпуска и позже нужно вывести обычное предложение об установке приложения.
         Для года создания телефона используйте переменную clientDeviceYear, в которой необходимо указать 2015 год.
         Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).*/

        System.out.println("\nЗадача_2:");

        int clientOS = 0;

        int clientDeviceYear = 2020;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
            } else {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке.");

                }
            }
        }

    public static void task3() {

        /**Задача 3
         Напишите программу, которая определяет, является ли год високосным или нет.
         Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
         Программа должна определять, високосный год или нет, и выводить соответствующее сообщение: «… год является
         високосным» или «... год не является високосным».
         Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
         Также високосным является каждый четырехсотый год.*/

        System.out.println("\nЗадача_3:");

        int year = 2004;

        boolean leapYear = year % 400 == 0 || year % 4 == 0 && year % 100 !=0;

        if (leapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
    public static void task4() {

        /**Задача 4
         В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том, когда будет доставлена
         его карта, нужно знать расстояние от офиса до адреса доставки.
         Правила доставки такие:
         Доставка в пределах 20 км занимает сутки.
         Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
         Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
         Свыше 100 км доставки нет.
         То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
         Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
         Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.*/

        System.out.println("\nЗадача_4:");

        int deliveryDistance = 44;

        int daysDelivery;

        if (deliveryDistance <= 20) {
            daysDelivery = 1;
            System.out.println("Потребуются дней: " + daysDelivery + " сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            daysDelivery = 2;
            System.out.println("Потребуются дней: " + daysDelivery+ ".");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daysDelivery = 3;
            System.out.println("Потребуются дней: " + daysDelivery+ ".");
        } else {
            System.out.println("Свыше ста километров доставки нет.");
        }
    }

    public static void task5() {

        /**Задача 5
         Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
         Например, 1-й месяц (он же январь) принадлежит к сезону зима.
         Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.
         Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).*/

        System.out.println("\nЗадача_5:");

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("1-й месяц (он же январь) принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println("2-й месяц (он же февраль) принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println("3-й месяц (он же март) принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println("4-й месяц (он же апрель) принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println("5-й месяц (он же май) принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println("6-й месяц (он же июнь) принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println("7-й месяц (он же июль) принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println("8-й месяц (он же август) принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println("9-й месяц (он же сентябрь) принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println("10-й месяц (он же октябрь) принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println("11-й месяц (он же ноябрь) принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println("12-й месяц (он же декабрь) принадлежит к сезону зима.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}