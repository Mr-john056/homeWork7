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
    public static void task2(){
        System.out.println("Задача 2");
    }
    public static void task3(){
        System.out.println("Задача 3");
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