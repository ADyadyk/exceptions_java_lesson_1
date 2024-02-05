package com.github.adyadyk.lesson_1;

import com.github.adyadyk.lesson_1.tasks.Task1;
import com.github.adyadyk.lesson_1.tasks.Task2;
import com.github.adyadyk.lesson_1.tasks.Task3;

public class Main {
    private static final Task1 task1 = new Task1();
    private static final Task2 task2 = new Task2();
    private static final Task3 task3 = new Task3();
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = null;
        int[][] ints = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1}
        };

//        task1.getLengthArray(arr, 2);
//        task2.runTask2(arr);
        System.out.println(task3.runTask3(ints));
    }
}
