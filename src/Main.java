import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        //Продолжите работать с кодом, который вы написали
        // в предыдущем уроке — в задачах с накоплениями.
        //С помощью цикла while посчитайте, сколько месяцев потребуется,
        // чтобы накопить 2 459 000 рублей при условии, что первоначально
        // мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        //Результат программы должен быть выведен в консоль с тем
        // количеством месяцев, которое необходимо для накопления
        // данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .
        System.out.println("Task1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i = i + 1;
            total = total + salary;
            if (i % 2 == 0)
                System.out.println(" Месяц " + i + " сумма накоплений равна " + total + " рублей ");
        }
        //Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        //На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        //Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        //Не забудьте выполнить переход на новую строку между двумя циклами.
        //В результате программы вывод должен получиться следующий:
        //Чтобы вывести числа в одну строку, вместо
        // System.out.println(); используйте System.out.print();
        // — без ln. Не забудьте в скобках добавить пробел, иначе все числа слипнутся.
        //Чтобы результаты каждого цикла были на отдельной строке,
        // между блоками кода добавьте команду System.out.println();
        System.out.println("Task2");
        int t = 1;
        int y = 10;
        while (t <= y) {
            System.out.print("  " + t + "  ");
            t++;
        }
        System.out.println();
        for (t = 10; t >= 1; ) {
            System.out.print("  " + t + "  ");
            t--;
        }
        System.out.println();

        //В стране Y население равно 12 миллионов человек.
        //Рождаемость составляет 17 человек на 1000, смертность
        // — 8 человек. Рассчитайте, какая численность населения будет через
        // 10 лет, если показатели рождаемости и смертности постоянны.
        //В консоль выведите результат операции на каждый год в формате:
        // «Год …, численность населения составляет …».
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
        //Василий решил положить деньги на накопительный счет,
        // где каждый месяц к сумме его вклада добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей.
        //Вычислите и выведите в консоль, сколько месяцев Василию
        // нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
        //Выведите в консоль результат программы с указанием
        // суммы накоплений по каждому месяцу
        System.out.println("Task4");
        float PutMoney = 15_000.00f;
        int iY = 0;
        float totalMoney = 0.0f;
        float proc = (float) (7.00 / 100.00f);
        int wanted = 12_000_000;
        while (totalMoney < wanted) {
            PutMoney = PutMoney + PutMoney * proc;
            totalMoney = PutMoney;
            iY++;
            String str = String.format(" Сумма накоплений = %f", totalMoney);
            System.out.println(" Месяц " + iY + str);
        }
        System.out.println("Task5");
        PutMoney = 15_000.00f;
        iY = 0;
        totalMoney = 0.0f;
        proc = (float) (7.00 / 100.00f);
        wanted = 12_000_000;
        while (totalMoney < wanted) {
            PutMoney = PutMoney + PutMoney * proc;
            totalMoney = PutMoney;
            iY++;
            String str = String.format(" Сумма накоплений = %f", totalMoney);
            if (iY % 6 == 0) {
                System.out.println(" Месяц " + iY + str);
            }
        }
        System.out.println("Task6");
        PutMoney = 15_000.00f;
        iY = 0;
        int year = 9 * 12;
        totalMoney = 0.0f;
        proc = (float) (7.00 / 100.00f);
        while (iY < year) {
            PutMoney = PutMoney + PutMoney * proc;
            totalMoney = PutMoney;
            iY++;
            String str = String.format(" Сумма накоплений = %f", totalMoney);
            if (iY % 6 == 0) {
                System.out.println(" Месяц " + iY + str);
            }
        }
        System.out.println("Task7");
        int firstFriday = 6;
        for (int friday = firstFriday; friday <= 31; friday+=7){
            System.out.println("Сегодня пятница " + friday + " -e число. Необходимо подготовить отчёт");}
}
}