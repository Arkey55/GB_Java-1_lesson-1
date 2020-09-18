package ru.geekbrains.lesson_1;

public class Main {

    public static void main(String[] args) {
//      Задание 2
        byte bt = 5;
        short st = 12;
        int it = 100;
        long lg = 10020;
        float ft = 1.2f;
        double db = 3.14;
        char ch = 'b';
        boolean bl = true;
        String s = "some string";

        System.out.println("Задание 3: " + x(10,2, 10, 2));
        System.out.println("Задание 4: " + y(2, 7));
        z(-10);
        System.out.println("Задание 6: " + w(-1));
        System.out.println("Задание 7: Привет, " + name("NoName") + "!");
        year(2020);
    }

//    Задание 3
    static int x (int a, int b, int c, int d){
        return a * (b + (c / d));
    }

//    Задание 4
    static boolean y (int a, int b){
        if (a + b < 10 || a + b > 20)
            return false;
        else
            return true;
    }

//    Задание 5
    static void z (int a){
        if (a >= 0)
            System.out.println("Задание 5: Число положительное");
        else
            System.out.println("Задание 5: Число отрицательное");
    }

//    Задание 6
    static boolean w (int a){
        if(a < 0)
            return true;
        else
            return false;
    }

//    Задание 7
    static String name (String s){
        return s;
    }

//    Задание 8
    static void year (int a){
        if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
            System.out.println("Задание 8: " + a + " год - високосный!");
        else
            System.out.println("Задание 8: " + a + " год - не високосный!");
    }
}
