package com.github.adyadyk.lesson_1.tasks;

import java.util.Scanner;

public class Task2 {
    /*
    * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
    * Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
    * 1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
    * 2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
    * 3. если вместо массива пришел null, метод вернет -3
    * 4. Напишите метод, в котором реализуйте взаимодействие с пользователем.
    * То есть, этот метод запросит искомое число у пользователя, вызовет первый,
    * обработает возвращенное значение и покажет читаемый результат пользователю.
    * Например, если вернулся -2, пользователь увидит сообщение: “Искомый элемент не найден”.
    * */
    public Integer getInfoAboutArray(int[] array, int minimum, int number){
        if(array == null) return -3;
        if(array.length < minimum) return -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) return i;
        }
        return -2;
    }

    public void getErrorCode(int number){
        if(number == -3) System.out.println("Вместо массива пришло null. Код ошибки: -3");
        if(number == -2) System.out.print("Искомый элемент не найден. Код ошибки: -2");
        if(number == -1) System.out.println("Длина массива меньше заданного минимума. Код ошибки: -1");
    }

    public void runTask2(int[] arr){
        int number = promptInt("Введите число: ");
        int result = getInfoAboutArray(arr, 4, number);
        if ( result == -1 || result == -2 || result == -3) {
            getErrorCode(result);
        } else System.out.println("Искомый индекс равен: " + result);
    }

    public String promptString(String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public Integer promptInt(String message){
        return Integer.parseInt(promptString(message));
    }
}
