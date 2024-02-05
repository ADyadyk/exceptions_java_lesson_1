package com.github.adyadyk.lesson_2.tasks;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Изучите данный код. Все ли с ним хорошо? Если нет,
 * скорректируйте код, попробуйте обосновать свое решение.
 */
public class Task1 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print(
                "Укажите индекс элемента массива, " +
                        "в который хотите записать значение 1: ");

//        Обработка без catch (InputMismatchException e)
// ______________________________________________________________________
        int index = 0;
        if(scanner.hasNextInt()) index = scanner.nextInt();
        else {
            System.err.println("Введено не число");
        }
// ______________________________________________________________________

        try {
//            int index = scanner.nextInt();
            arr[index] = 1;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Указан индекс за пределами массива");
        }
//        catch (InputMismatchException e){
//            System.err.println("Вместо индекса массива введёно не число");
//        }
    }
}
