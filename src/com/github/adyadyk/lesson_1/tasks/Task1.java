package com.github.adyadyk.lesson_1.tasks;

public class Task1 {
    /*
    * Реализуйте метод, принимающий в качестве аргументов целочисленный массив и некоторый допустимый минимум.
    * Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки,
    *  иначе - длину массива.
    * */
    public Integer getLengthArray(int[] array, int x){
        if(array.length < x) return -1;
        return array.length;
    }
}
