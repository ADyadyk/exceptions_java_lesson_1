package com.github.adyadyk.lesson_1.tasks;

public class Task3 {
    /*
    * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
    * Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
    * метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
    * и в каждой ячейке может лежать только значение 0 или 1. Если нарушается одно из условий,
    * метод должен бросить RuntimeException с сообщением об ошибке.
    * */

    public int runTask3(int[][] matrix){
        checkSquare(matrix);
        return sumElementsTwoDimensionalArray(matrix);
    }

    public int sumElementsTwoDimensionalArray(int[][] matrix){
        int result= 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (check1or0(matrix[i][j])){
                    result += matrix[i][j];
                }
            }
        }
        return result;
    }


    /**
     * Проверка - квадратный ли массив
     */
    public void checkSquare(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i].length != matrix.length){
                throw new RuntimeException("Массив не квадратный"); // На этой строчке кода выполнение программы прекратится
            }
        }
    }

    /**
     * Проверка равно ли число 0 или 1
     */
    public boolean check1or0(int item){
        if(item != 0 && item != 1){
            throw new RuntimeException("Элемент " + item + " не равен 0 или 1."); // На этой строчке кода выполнение программы прекратится
        }
        return true;
    }
}
