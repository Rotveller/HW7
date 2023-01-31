import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        /////////////////////////////
        System.out.println("Task1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + salary;
            System.out.println(" Месяц " + i + " сумма накоплений равна " + total + " рублей ");
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
        y = 2023;
        do {
            y++;
            peopleY = peopleY + peopleY * (b - d) / 1000;
            System.out.println("Год " + y + " численность населения состовляет= " + peopleY);
        }
        while (y < 2033);
        ////////////////////////////
        System.out.println("Task4");
        float putMoney = 15_000.00f;
        int iY = 0;
        float totalMoney = 0.0f;
        float proc = (float) (7.00 / 100.00f);
        float wanted = 12_000_000f;
        while (totalMoney < wanted) {
            iY=iY+1;
            totalMoney = putMoney + (putMoney * proc);
            String str = String.format(" Сумма накоплений = %f", totalMoney);
            System.out.println(" Месяц " + iY + str);
        }
        /////////////////////
        System.out.println("Task5");
        putMoney = 15_000.00f;
        iY = 0;
        totalMoney = 0.0f;
        proc = (float) (7.00 / 100.00f);
        wanted = 12_000_000;
        while (totalMoney < wanted) {
            putMoney = putMoney + putMoney * proc;
            totalMoney = putMoney;
            iY++;
            String str = String.format(" Сумма накоплений = %f", totalMoney);
            if (iY % 6 == 0) {
                System.out.println(" Месяц " + iY + str);
            }
        }
        ////////////////////
        System.out.println("Task6");
        putMoney = 15_000.00f;
        iY = 0;
        int year = 9 * 12;
        proc = (float) (7.00 / 100.00f);
        while (iY < year) {
            totalMoney = putMoney + putMoney * proc;
            iY++;
            String str = String.format(" Сумма накоплений = %f", totalMoney);
            if (iY % 6 == 0) {
                System.out.println(" Месяц " + iY + str);
            }
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
        for (int dayBoom = firsTime; dayBoom < yearLast; dayBoom += 79) {
            if (dayBoom >= yearFirst) {
                System.out.println(dayBoom);
            }
        }
    }
}