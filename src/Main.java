public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int firstFriday = 5;

        for (int i = 1; i <= 31; i++) {
            if (i == firstFriday) {
                System.out.println("Сегодня пятница, " + i + " число. Необходимо подготовить отчет");
                firstFriday += 7;
            }
        }

        System.out.println(" ");
        System.out.println("Задача 2. Способ 1");
        int distanceAll = 42195;
        int distancePass = 0;

        do {
            distancePass += 500;
            System.out.println("Держитесь! Осталось " + (distanceAll - distancePass) + " метров");
        } while (distancePass + 500 < distanceAll);
        System.out.println(" ");
        System.out.println("Задача 2. Способ 2");
        distancePass = 500;
        for (; distancePass < distanceAll; distancePass = distancePass + 500) {
            System.out.println("Держитесь! Осталось " + (distanceAll - distancePass) + " метров");
        }

        System.out.println(" ");
        System.out.println("Задача 3. Способ 1");
        int summa = 700;
        int price = 100;
        int kolDay = 0;

        while (summa >= price) {
            kolDay++;

            if (kolDay % 5 == 0) {
                continue;
            }
            summa -= price;
        }
        System.out.println("Количество оплаченных дней парковки " + kolDay);
        System.out.println(" ");
        System.out.println("Задача 3. Способ 2");
        summa = 700;
        kolDay = 1;
        for (; summa >= price; kolDay++) {
            if (kolDay % 5 == 0) {
                continue;
            }
            summa -= price;
        }
        System.out.println("Количество оплаченных дней парковки " + (kolDay - 1));

        System.out.println(" ");
        System.out.println("Задача 4");
        double total = 0;
        int month = 0;

        do {
            month++;
            total += 15000;
            if (month % 6 == 0) {
                total = total * 1.07;
            }
            System.out.println(String.format("Месяц %d, сумма накоплений равна %.2f руб.", month, total));

            if (total >= 12_000_000) {
                break;
            }
        } while (true);
        System.out.println("Цель достигнута!");

        System.out.println(" ");
        System.out.println("Задача 5");

        int charge = 20; // текущий уровень заряда в %
        int minute = 0;  // счетчик времени зарядки
        int overheats = 0; // количество перегревов

        while (charge < 100) {
            minute++;

            if (minute % 10 == 0) {
                minute++;
                overheats++;
                if (overheats > 3) {
                    System.out.println("Зарядка прекращена! Текущий заряд: " + charge + "%");
                    break;
                } else {
                    System.out.println("Перегрев! Зарядка приостановлена... Уровень заряда " + charge);
                    continue;
                }
            }
            charge += 2;
        }
        System.out.println("Время подзарядки: " + minute + "мин.");
    }
}