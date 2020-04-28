package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int temp = remainder(9, 4);
        System.out.println("Задача 1 : " + temp + " ");
        int minutes = triArea(10, 9);
        System.out.println("Задача 2 : " + minutes + " ");
        int hours = animals(2, 3, 4);
        System.out.println("Задача 3 : " + hours + " ");
        profitableGamble(0.2, 50, 9);
        operation(3,9,27);
        ctoa('*');
        add(5);
        int[] mas = new int[]{1,2,3};
        sumOfCubes(mas, 3);
        abcmath(42,5,10);
    }

    public static int remainder(int a, int b) {
        int result = a % b;
        return result;
    }

    public static int triArea(int a, int b) {
        int result = a * b / 2;
        return result;
    }

    public static int animals(int a, int b, int c) {
        int result = a * 2 + b * 4 + c * 4;
        return result;
    }

    public static int profitableGamble(double a, int b, int c) {
        if (a * b > c) {
            System.out.println("Задача 4 : " + "true" + " ");
        } else {
            System.out.println("Задача 4 : " + "false" + " ");
        }
        return 0;
    }

    public static int operation(int a, int b, int c) {
        if (a + b == c) {
            System.out.println("Задача 5 : " + "added" + " ");
        } else if (a - b == c) {
            System.out.println("Задача 5 : " + "substracted" + " ");
        } else if (a / b == c) {
            System.out.println("Задача 5 : " + "deleted" + " ");
        } else if (a * b == c) {
            System.out.println("Задача 5 : " + "ymnozhit" + " ");
        } else {
            System.out.println("Задача 5 : " + "none" + " ");
        }
        return 0;
    }

    public static int ctoa(char a) {
        System.out.println("Задача 6 : " + (int) a + " ");
        return 0;
    }

    public static int add(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i = i + 1 ){
            sum = sum + i;
        }
        System.out.println("Задача 7 : " + sum + " ");
        return 0;
    }
    public static int sumOfCubes(int[] mas, int k) {
        int sum = 0;
        for (int i = 0; i < k - 1; i = i + 1){
            int t = mas[i];
            sum = sum + t*t*t;
        }
        System.out.println("Задача 9 : " + sum + " ");
        return 0;
    }
    public static void abcmath(int a, int b , int c){
        int k = a;
        for (int i = 0; i < b; i++){
            k = k*2;
        }
        if (k%c==0){
            System.out.println("Задача 10 : " + "true" + " " );
        }
        else{
            System.out.println("Задача 10 : " + "false" + " " );
        }
    }
}
