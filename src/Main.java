public class Main {
    public static void main(String[] args) {
        /////////////////////////////
        System.out.println("Task1");
        int monthFee = 15_000;
        int total = 0;
        int month = 1;
        int wanted = 2_459_000;
        while (total < wanted) {
            total = total + monthFee;
            System.out.println(" Месяц " + month + " сумма накоплений равна " + total + " рублей ");
            month++;
        }
        ///////////////////////////
        System.out.println("Task2");
        int t = 1;
        int y = 10;
        while (t <= y) {
            System.out.print("  " + t + "  ");
            t++;
        }
        System.out.println();
        for (t = 10; t >= 1; t--) {
            System.out.print("  " + t + "  ");
        }
        System.out.println();
        ///////////////////////////
        System.out.println("Task3");
        int peopleY = 12_000_000;
        int b = 17;
        int d = 8;
        int difference = b - d;
        y = 2023;
        do {
            y++;
            peopleY = peopleY + peopleY * difference / 1000;
            System.out.println("Год " + y + " численность населения состaвляет= " + peopleY);
        }
        while (y < 2033);
        ////////////////////////////
        System.out.println("Task4");
        wanted = 12_000_000;
        total = 15_000;
        month = 1;
        double perc = 7 / 100D;
        while (total < wanted) {
            total = total + (int) (total * perc);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }
        /////////////////////
        System.out.println("Task5");
        total = 15_000;
        wanted = 12_000_000;
        month = 1;
        perc = 7 / 100D;
        while (total < wanted) {
            total = total + (int) (total * perc);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
            month++;
        }
        ////////////////////
        System.out.println("Task6");
        month = 1;
        wanted = 108;
        total = 15_000;
        perc = 7 / 100D;
        while (month < wanted) {
            total = total + (int) (total * perc);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
            month++;
        }
        /////////////////////////////
        System.out.println("Task7");
        int firstFriday = 1;
        for (int friday = firstFriday; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница " + friday + " -e число. Необходимо подготовить отчёт");
        }
        ////////////////////////////
        System.out.println("Task8");
        int yearComet = 2023;
        int yearFirst = yearComet - 200;
        int yearLast = yearComet + 100;
        int firsTime = 0;
        int period = 79;
        for (int dayBoom = yearFirst; dayBoom <= yearLast; dayBoom++) {
            if (dayBoom % period == firsTime) {
                System.out.println(dayBoom);
            }

        }
    }
}