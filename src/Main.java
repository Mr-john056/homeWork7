public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
    }
    public static void task5(){
        System.out.println("Задача 5");
    }
    public static void task6(){
        System.out.println("Задача 6");
    }
    public static void task7(){
        System.out.println("Задача 7");
    }
}