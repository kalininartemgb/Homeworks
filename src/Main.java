public class Main {
    public static void main(String[] args) {
        //Task 1
        //До конца не понял, какие конкретно значения нужно проставить.
        // По этому инициализацию переменной сделал на своё усмотрение
        System.out.println("==TASK 1==");
        byte varByte = 127;
        short varShort = 32767;
        int vraInt = 2147483647;
        long varLong = 9223372036L;
        float varFloat = 1.1f;
        double varDouble = 11.11;
        //Вариант по заданию
        System.out.println("Значение переменной 127 с типом byte равно " + varByte);
        System.out.println("Значение переменной 32767 с типом short равно " + varShort);
        System.out.println("Значение переменной 2147483647 с типом int равно " + vraInt);
        System.out.println("Значение переменной 9223372036L с типом long равно " + varLong);
        System.out.println("Значение переменной 1.1f с типом float равно " + varFloat);
        System.out.println("Значение переменной 1.11 с типом double равно " + varDouble);
        //Мой вариант, так информативней
        System.out.println("==Мой вариант==");
        System.out.println("Имя переменной varByte с типом byte равно " + varByte);
        System.out.println("Имя переменной varShort с типом short равно " + varShort);
        System.out.println("Имя переменной vraInt с типом int равно " + vraInt);
        System.out.println("Имя переменной varLong с типом long равно " + varLong);
        System.out.println("Имя переменной varFloat с типом float равно " + varFloat);
        System.out.println("Имя переменной varDouble с типом double равно " + varDouble);

        //Task2
        byte varByteTaskTwo = 67;
        short varShotTaskTwo = -159;
        int varIntTaskTwo = 27897;
        long varLongTaskTwo = 987678965549L;
        float varFloatTaskTwo = 2.786f;
        double varDoubleTaskTwo = 27.12;

        //Task3
        System.out.println("==TASK 3==");
        byte firstTeacherStudents = 23;
        byte secondTeacherStudents = 27;
        byte thirdTeacherStudents = 30;
        short buyAllPaper = 480;
        int howManyStudentsHasPaper = buyAllPaper / (firstTeacherStudents + secondTeacherStudents + thirdTeacherStudents);
        System.out.println("На каждого ученика рассчитано " + howManyStudentsHasPaper + " листов бумаги.");

        //Task 4
        System.out.println("==TASK 4==");
        float machinePerformance = 16.0f;
        double timeForOneBottle = (2.0 * 60.0) / machinePerformance;
        double amountPerTwentyMin = (60*20) / timeForOneBottle;
        double amountPerDay = (60*(24*60)) / timeForOneBottle;
        double amountPerThreeDays = (60*((24*60)*3)) /timeForOneBottle;
        double amountPerOneMonth = (60*((24*60)*30)) / timeForOneBottle;

        System.out.println("За " + timeForOneBottle + " секунд машина произвела 1 бутылку");
        System.out.println("За 20 минут машина произвела " + amountPerTwentyMin +" штук бутылок");
        System.out.println("За 1 день машина произвела " + amountPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + amountPerThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + amountPerOneMonth +" штук бутылок");

        //Task5
        System.out.println("==TASK 5==");
        short allCansOfPaint = 120;
        byte whiteCansOfPaintPerClass = 2;
        byte brownCansOfPaintPerClass = 4;
        int classRooms = allCansOfPaint / (whiteCansOfPaintPerClass + brownCansOfPaintPerClass);
        int allWhiteCansOfPaint = 2 * 20;
        int allBrownCansOfPaint = 4 * 20;
        System.out.println("В школе, где " + classRooms + " классов, нужно " + allWhiteCansOfPaint + " банок белой краски и " + allBrownCansOfPaint + " банок коричневой краски" );

        //Task6
        System.out.println("==TASK 6==");
        short bananas = 5 * 80;
        short milk = 105 * 2;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int weightGram = bananas + milk + iceCream + eggs;
        System.out.println(bananas + " " + milk + " " + iceCream + " " + eggs);
        float weightKilogram = ((float) bananas + milk + iceCream + eggs) / 1000;
        System.out.println("Вес спорт завтрака равен " + weightGram + " грамм");
        System.out.println("Вес спорт завтрака равен " + weightKilogram + " килограмм");

        //Task 7
        System.out.println("==TASK 7==");
        short losingWeight = 7;
        short slowLosingWeight = 250;
        short fastLosingWeight = 500;
        int slowLosingWeightDays = (losingWeight * 1000) / slowLosingWeight;
        int fastLosingWeightDays = (losingWeight * 1000) / fastLosingWeight;
        int averageLosingWeightDays =  (slowLosingWeightDays + fastLosingWeightDays) / 2;
        System.out.println("Всего " + slowLosingWeightDays + " дней потребуется для похудения на " + losingWeight + " кг, если сбрасывать по " + slowLosingWeight + " грамм в сутки");
        System.out.println("Всего " + fastLosingWeightDays + " дней потребуется для похудения на " + losingWeight + " кг, если сбрасывать по " + fastLosingWeight + " грамм в сутки");
        System.out.println("В среднем " + averageLosingWeightDays + " день потребуется, чтобы добиться результата похудения ");

        //Task8
        //Условие не до конца понятно: сотрудники получают премию после 3х лет работы или за прошедшие 3 года она тоже получит премию?
        //Представим, что Маша устроилась в компанию с 2022 года. Отработала 3 года и начиная с 2025 у Маши начала капать премия.
        //Значит Маша получит повышение ЗП на текущий(2025) год. Следовательно, она не получает премию за 2022,2023,2024.
        //Я правильно понял задание?
        System.out.println("==TASK 8==");

        //Workers salary
        float firstWorkerSalary = 67760;
        float secondWorkerSalary = 83690;
        float thirdWorkerSalary = 76230;

        //Salary increase
        float increasePercentage = 10.0f;
        float salaryIncrease = (1 + increasePercentage / 100) ;

        //Increase in workers salary
        float firstWorkerNewSalary = firstWorkerSalary * salaryIncrease;
        float secondWorkerNewSalary = secondWorkerSalary * salaryIncrease;
        float thirdWorkerNewSalary = thirdWorkerSalary * salaryIncrease;

        //Difference in annual income
        float firstWorkerDifferenceSalary = (firstWorkerNewSalary - firstWorkerSalary) * 12;
        float secondWorkerDifferenceSalary = (secondWorkerNewSalary - secondWorkerSalary) * 12;
        float thirdWorkerDifferenceSalary = (thirdWorkerNewSalary - thirdWorkerSalary) * 12;

        System.out.println("Маша теперь получает " + firstWorkerNewSalary + " рублей. Годовой доход вырос на " + firstWorkerDifferenceSalary  + " рублей");
        System.out.println("Денис теперь получает " + secondWorkerNewSalary + " рублей. Годовой доход вырос на " + secondWorkerDifferenceSalary  + " рублей");
        System.out.println("Кристина теперь получает " + thirdWorkerNewSalary + " рублей. Годовой доход вырос на " + thirdWorkerDifferenceSalary  + " рублей");

    }

}