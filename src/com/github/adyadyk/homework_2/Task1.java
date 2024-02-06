package com.github.adyadyk.homework_2;

    public class Task1 {
        public static void main(String[] args) {
            String input;
            if (args.length == 0) {
                input = "3.14g"; // По умолчанию используем "3.14", если аргумент не передан
            }
            else {
                input = args[0];
            }
//            try{
                float result = isFloat(input);
                System.out.println(result);
//            } catch (NumberFormatException e){
//                System.err.println("Your input is not a float number. Please, try again.");
//            }

        }
        public static float isFloat(String input) /*throws  NumberFormatException*/ {
// Введите свое решение ниже
//            return Float.parseFloat(input);
            try{
                return Float.parseFloat(input);
            } catch (NumberFormatException e){
                System.err.println("Your input is not a float number. Please, try again.");
            }
            return Float.NaN;
        }
    }

