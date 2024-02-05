package com.github.adyadyk.lesson_2.tasks;

/**
 * Обработайте возможные исключительные ситуации. "Битые" значения
 * в исходном массиве считайте нулями. Можно внести в код правки,
 * которые считаете необходимыми
 */
public class Task2 {
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int val = 0;
                if(isInteger(arr[i][j])) val = Integer.parseInt(arr[i][j]);
                else throw new RuntimeException("В массиве с индексами i=" + i
                        + " и j=" + j + " выявлено не число: " + arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    private static boolean isInteger(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
