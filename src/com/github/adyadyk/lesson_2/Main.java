package com.github.adyadyk.lesson_2;

import com.github.adyadyk.lesson_2.tasks.Task1;
import com.github.adyadyk.lesson_2.tasks.Task2;
import com.github.adyadyk.lesson_2.tasks.Task3;

public class Main {
    public static void main(String[] args) {
        // Вызов Task 1
//        Task1.run();

        // Двумерные массивы для Task 2
        String[][] arr3 = new String[][]{
                {"1", "1", "1", "1", "1"},
                {"1", "1"},
                {"2"},
                {"1", "1", "1"},
        };

        String[][] arr0 = new String[][] {
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };

        String[][] arr = new String[][] {
                {"1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "2"},
                {"3", "3"},
                {"2", "6"}
        };

//        System.out.println(Task2.sum2d(arr3));

        // Вызов Task 3
//        Task3.run();
    }
}
