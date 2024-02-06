package com.github.adyadyk.homework_2;

public class Task3 {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 90;
            b = 3; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        double result = expr(a, b);
        System.out.println(result);
    }

    public static double expr(int a, int b) {
        // Введите свое решение ниже
        printSum(a, b);
        try{
            int temp = a / b;
            return (double) a / b;

        }catch (ArithmeticException e){
            System.out.println("Невозможно выполнить деление");
            return 0;
        }
    }

    public static void printSum(int a, int b) {
        // Введите свое решение ниже
        System.out.println(a + b);
    }
}