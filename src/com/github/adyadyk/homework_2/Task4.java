package com.github.adyadyk.homework_2;

public class Task4 {
    public static void main(String[] args) {
        char a;

        if (args.length == 0) {
            a = 'd'; // Значение по умолчанию, если аргументы не были предоставлены
        } else {
            a = args[0].charAt(0); // Преобразуйте первый аргумент командной строки в символ
        }

        try {
            String result = expr(a);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static String expr(char a) throws Exception {
// Введите свое решение ниже
        String temp = "" + a;
        if(temp.equals(" ")) throw new RuntimeException("Empty string has been input.");
        else{
            return  "Your input was - " + a;
        }
    }
}
