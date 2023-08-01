public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        System.out.println("Задача 1");
        int accumulation = 15_000;
        int total = 0;
        int step = 1;
        while (total < 2_459_000) {
            total = total + accumulation;
            step = step + 1;
            System.out.println("Месяц " + step + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задача 2");
        int setNumbers = 1;
        int setNumbers2 = 10;
        while (setNumbers <= 10){
            System.out.print(setNumbers + " ");
            setNumbers = setNumbers + 1;
        }
        System.out.println();
        while (setNumbers2 >= 1) {
            System.out.print(setNumbers2 + " ");
            setNumbers2 = setNumbers2 - 1;
        }
        System.out.println();
    }
    public static void task3(){
        System.out.println("Задача 3");
        int sideY = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int growth = birthRate - deathRate;
        int year = 1;
        while (year <= 10){
            sideY += sideY * growth / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + sideY);
            year = year + 1;
        }
        System.out.println();
    }
    public static void task4(){
        System.out.println("Задача 4");
        int startDeposit = 15_000;
        int depositPercentage = 7;
        int i = 1;
        for (int totalDeposit = 0;totalDeposit <= 12_000_000;i++){
            totalDeposit += startDeposit * depositPercentage / 100;
            totalDeposit = totalDeposit + startDeposit;
             if (i % 5 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений составляет " + totalDeposit);
            }
        }
        System.out.println();
    }
    public static void task5(){
        System.out.println("Задача 5");
        int startDeposit = 15_000;
        int totalDeposit = 0;
        int depositPercentage = 7;
        int i = 1;
        for (;totalDeposit <= 12_000_000;i++){
            totalDeposit += startDeposit * depositPercentage / 100;
            totalDeposit = totalDeposit + startDeposit;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений составляет " + totalDeposit);
            }
        }
        System.out.println();
    }

    public static void task6(){
        System.out.println("Задача 6");
        int startDeposit = 15_000;
        int totalDeposit = 0;
        int depositPercentage = 7;
        int depositTermYear = 9;
        int depositTermMonth = 9 * 12;
        int i = 1;
        for (;i <= depositTermMonth;i++) {
            totalDeposit += startDeposit * depositPercentage / 100;
            totalDeposit = totalDeposit + startDeposit;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений составляет " + totalDeposit);
            }
        }
        System.out.println();
    }

    public static void task7(){
        System.out.println("Задача 7");
        int totalDaysOfMonth = 31;
        int firstFridayMonth = 5;
        for (int day = firstFridayMonth; day <= totalDaysOfMonth; day = day + 7){
           System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
           }
        System.out.println();
    }

    public static void task8(){
        System.out.println("Задача 8");
        int year = 2017;
        int firstYear = 1817;
        int yearCometFlight = 79;
        int lastYear = 2117;
        int cometFlyByYear = firstYear;
        while (cometFlyByYear <= lastYear) {
            cometFlyByYear = cometFlyByYear + yearCometFlight;
            System.out.println("Год полёта кометы: " + cometFlyByYear);
        }
    }
}