package com.github.adyadyk.homework_2;

import java.util.Arrays;

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Task2 {
    public static void main(String[] args) {
        int[] intArray;
        int d;

        if (args.length == 0) {
            intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            d = 0; // По умолчанию используем 0, если аргумент не передан
        } else {
            intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
            d = Integer.parseInt(args[1]); // Можно использовать значение по умолчанию или передать его как аргумент.
        }

        double result = expr(intArray, d);
        System.out.println(result);
    }

    public static double expr(int[] intArray, int d) {
        // Введите свое решение ниже
        try{
            int temp = intArray[8] / d; // Введено для проверки деления на ноль, чтобы избежать infinity в результате
            double result = (double)intArray[8] / d;
            System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + result);
            return result;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
        }catch (ArithmeticException e){
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
        }
        double a = Double.NEGATIVE_INFINITY; // Введено, чтобы в консоль выкидывалось NaN
        return a-a;
    }
}
