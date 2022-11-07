public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ-3");
        byte apples = 99;
        System.out.println("Яблок " + apples + " кг");
        short pears = 250;
        System.out.println("Груш "+ pears + " кг");
        int grains = 123456789;
        System.out.println("Зерна " + grains + " кг");
        Long coal = 1111111111888888L;
        System.out.println("Угля " + coal + " кг");
        float oranges = 2.4f;
        System.out.println("Апельсинов " + oranges + " кг");
        double mandarins = 4.36;
        System.out.println("Мандарины " + mandarins + " кг");
        double potato = 27.12;
        System.out.println("Картофель " + potato + " кг");
        Long cabbage = 987678965549L;
        System.out.println("Капусты " + cabbage + " кг");
        float plums = 2.786f;
        System.out.println("Слив " + plums + " кг");
        Short cars = 569;
        System.out.println("Машин " + cars + " шт");
        short airTemperature = -159;
        System.out.println("Температура воздуха " + airTemperature + " градусов");
        short balls = 27897;
        System.out.println("Мячей " + balls + " шт");
        byte hats = 67;
        System.out.println("Шляп " + hats + " шт");
        byte T1 = 23;
        System.out.println("Людмила Павловна обучает " + T1 + " ученика");
        byte T2 = 27;
        System.out.println("Анна Сергеевна обучает " + T2 + " учеников");
        byte T3 = 30;
        System.out.println("Ектаерина Андреевна обучает " + T3 + " учеников");
        short paper = 480;
        System.out.println("Учителя купили всего " + paper + " листов");
        int allStudents = T1 + T2 + T3;
        System.out.println("Всего учеников у всех учителей " + allStudents + " человек");
        int paperForStudents = paper / allStudents;
        System.out.println("На кажого ученика расчитано " + paperForStudents + " листов бумаги");
        byte bottles = 16;
        System.out.println("Производительность " + bottles + " бутылок за 2 мин.");
        int productivityPerMinute = bottles / 2;
        System.out.println("Производительность " + productivityPerMinute + " бутылок за 1 мин");
        int productivityFor20min = productivityPerMinute * 20;
        System.out.println("Производительность " + productivityFor20min + " бутылок за 20 мин");
        byte hoursPerDay = 24;
        byte inOneHorsMinutes = 60;
        int minutesInOneDay = hoursPerDay * inOneHorsMinutes;
        System.out.println("В сутках " + minutesInOneDay + " минут");
        int minutesInTreeDays = minutesInOneDay * 3;
        System.out.println("В трех сутках " + minutesInTreeDays + " минут");
        byte inOneMonth = 30;
        System.out.println("В месяце " + inOneMonth + " дней");
        int minutesInOneMonth = inOneMonth * minutesInOneDay;
        System.out.println("В одном месяце " + minutesInOneMonth + " минут");
        int productivityPerOneDay = productivityPerMinute * minutesInOneDay;
        System.out.println("Производительность бутылок " + productivityPerOneDay + " за сутки");
        int productivityPerTreeDays = productivityPerMinute * minutesInTreeDays;
        System.out.println("Производительность бутылок " + productivityPerTreeDays + " за трое суток");
        int productivityPerOneMonth = productivityPerMinute * minutesInOneMonth;
        System.out.println("Производительнсоть бутылок " + productivityPerOneMonth + " за один месяц");
        byte paints = 120;
        System.out.println("Школе нужно всего " + paints + " банок краски двух цветов");
        byte brownPaints = 4;
        System.out.println("Коричневой краски нужно " + brownPaints + " банки на один лкасс");
        byte whitePaints = 2;
        System.out.println("Белой краски нужно " + whitePaints + " банки на один класс");
        int paintsForOneClassroom = brownPaints + whitePaints;
        System.out.println("На один класс нужно " + paintsForOneClassroom + " банок краски");
        int classroomInShcoll = paints / paintsForOneClassroom;
        System.out.println("Всего классов в школе " + classroomInShcoll);
        int whitePaintsForOneClassroom = classroomInShcoll * whitePaints;
        System.out.println("Белой краски нужно " + whitePaintsForOneClassroom + " на один класс");
        int brownPaintsForOneClassroom = classroomInShcoll * brownPaints;
        System.out.println("Коричневой крски нужно " + brownPaintsForOneClassroom + " на один класс");
        System.out.println("В школе, где " +classroomInShcoll+ " классов, нужно " + whitePaintsForOneClassroom + " белой краски и " + brownPaintsForOneClassroom + " коричневой краски.");
        byte allBanana = 5;
        System.out.println("Всего бананов " + allBanana + " шт");
        byte weightOfOneBanana = 80;
        System.out.println("Вес одного банана " + weightOfOneBanana + " грамм");
        int totalWeightBananas = allBanana * weightOfOneBanana;
        System.out.println("Общий вес бананов " + totalWeightBananas + " грамм");
        short milk = 200;
        System.out.println("Молока всего " + milk + " мл");
        short in100mlMilk = 105;
        System.out.println("В 100 мл молока " + in100mlMilk + " грамм");
        int totalWeightMilk = in100mlMilk * 2;
        System.out.println("Общий вес молока " + totalWeightMilk + " грамм");
        byte plombir = 2;
        System.out.println("Всего пломбиров " + plombir + " брикета");
        byte weightOnePlombir = 100;
        System.out.println("Вес одного брикета пломбира " + weightOnePlombir + " грамм");
        int totalWeightPlombir = plombir * weightOnePlombir;
        System.out.println("Общий вес пломбира " + totalWeightPlombir + " грамм");
        byte egg = 4;
        System.out.println("Всего яиц " + egg + " штук");
        byte weightOneEgg = 70;
        System.out.println("Вес одного яйца " + weightOneEgg + " грамм");
        int totalWeightEggs = egg * weightOneEgg;
        System.out.println("Общий вес яиц " + totalWeightEggs + " грамм");
        int cocktailWeight = totalWeightEggs + totalWeightBananas + totalWeightMilk + totalWeightPlombir;
        System.out.println("Общий вес коктейлья равен " + cocktailWeight + " грамм");
        short inOneKg = 1000;
        System.out.println("В одном килограмме " + inOneKg + " грамм");
        float cocktailWeightInKg = cocktailWeight / inOneKg;
        System.out.println("Вес коктейля в килограммах " + cocktailWeightInKg + " кг");
        short oneKg = 1000;
        System.out.println("Один кг = " + oneKg + " грамм");
        byte overweightAthlete = 7;
        System.out.println("Лишний вес спортсмена " + overweightAthlete + " кг");
        int overweightAthleteInGr = oneKg * overweightAthlete;
        System.out.println("Лишний вес спортсмена в граммах составляет " + overweightAthleteInGr + " грамм");
        short dietOne = 250;
        System.out.println("Первая диета позволяет сбрасивать в день " + dietOne + " грамм");
        short dietTwo = 500;
        System.out.println("Вторая диета позволяет сбрасивать в день " + dietTwo + " грамм");
        int resultOne = overweightAthleteInGr / dietOne;
        System.out.println("Результат при аепвой диете будет достигнут за " + resultOne + " дней");
        int resultTwo = overweightAthleteInGr / dietTwo;
        System.out.println("Результат при второй диете будет достигнут при " + resultTwo + " дней");
        int Masha = 67760;
        System.out.println("Зарплата Маши состаляет " + Masha + " рублей");
        int Denis = 83690;
        System.out.println("Зарплата Дениса составляет " + Denis + " рублей");
        int Kristina = 76230;
        System.out.println("Зарплата Кристины составялет " + Kristina + " рублей");
        int Masha1 = Masha * 12;
        int Denis1 = Denis *12;
        int Kristina1 = Kristina *12;
        System.out.println("Зарплаты сотрудников за год составляют: Маши " + Masha1 + "," + " Дениса " + Denis1 + "," + " Кристины " + Kristina1 );
        int salaryIncrease = 10;
        System.out.println("Повысить зарплату необходимо на " + salaryIncrease + " % ");
        int salaryIncreaseMasha = Masha1 / 10;
        System.out.println("Повышение зарплаты Маши составит " + salaryIncreaseMasha + " рублей в год");
        int salaryOneMonth = salaryIncreaseMasha/12;
        System.out.println("За месяц зарплата Маши повыситься на " + salaryOneMonth + " рублей ");
        int totalSalaryOneMonthMash = Masha+salaryOneMonth;
        System.out.println("Зарплата Маши после повышения будет составлять " + totalSalaryOneMonthMash + " рублей");
        int salaryIncereaseDenis = Denis1 / 10;
        System.out.println("Повышение зарплаты Дениса составит " + salaryIncereaseDenis + " рублей");
        int salaryOneMonthD = salaryIncereaseDenis / 12;
        System.out.println("Повышение зарплаты Дениса за месяц составит " + salaryOneMonthD + " рублей");
        int totalSalaryOneMonthD = Denis + salaryOneMonthD;
        System.out.println("Зарплата Дениса после повышения будет составляьб " + totalSalaryOneMonthD + " рублей");
        int salaryIncereaseK = Kristina1 / 10;
        System.out.println("Повышение зарплаты Кристины составит " + salaryIncereaseK + " рублей");
        int salaryOneMonthK = salaryIncereaseK / 12;
        System.out.println("Повышения заплаты Кристины за месяц составит " + salaryOneMonthK + " рублей");
        int totalSalaryOneMonthK = Kristina + salaryOneMonthK;
        System.out.println("Зарплата Кристины после повышения будет составлять " + totalSalaryOneMonthK + " рублей");






































    }
}