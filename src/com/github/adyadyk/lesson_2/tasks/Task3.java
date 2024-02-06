package com.github.adyadyk.lesson_2.tasks;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Запишите в файл следующие строки:
 *
 * Анна=4
 * Елена=5
 * Марина=6
 * Владимир=?
 * Полина=?
 * Константин=?
 * Иван=4
 *
 * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap,
 * если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных,
 * если сохранено значение ?, заменить его на соответствующее число. Если на каком-то месте
 * встречается символ, отличный от числа или ?, бросить подходящее исключение.
 * Записать в тот же файл данные с замененными символами ?.
 */
public class Task3 {
    private static final List<String> strings = List.of
            ("Анна=4", "Елена=5", "Марина=?", "Полина=?", "Владимир=?", "Константин=?", "Иван=4");
//для проверки, заменить какое-то из значений на null
    private static final String pathToFile = "task3.txt";

    public static void run(){
        writeToFile(pathToFile, strings);
        System.out.println(readFromFile(pathToFile));
        reWriteToFile(pathToFile);
    }

    /**
     *Метод, который записывает список в файл
     */
    private static void writeToFile(String path, List<String> list){
        try (FileWriter fileWriter = new FileWriter(path, true)){
            // так как в FileWriter передано true, то в файл будет дозаписыватсься
            for (String string : list) {
                fileWriter.write(string + "\n"); // всё будет записано в буфер
            }
            fileWriter.flush(); // Теперь всё будет записано непосредственно в файл
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Метод, который читает из файла
     */
    private static Map<String, Integer> readFromFile(String path){
        Map<String, Integer> result = new LinkedHashMap<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                // На одной итерации записывается одна строчка из файла
//                System.out.println(line);
                String[] array = line.split("="); // сниппет .var (подставляет возвращаемый тип данных "слева")
                String key = array[0];
                String temp = array[1];
                int value;
                if(temp.equals("?")) value = key.length();
                else value = Integer.parseInt(temp);
                result.put(key, value);
            }
        } catch (IOException e){
            throw new RuntimeException("Ошибка при работе с файлом");
        } catch (NumberFormatException e){
            throw new RuntimeException("Введено не число и не символ: \"?\"");
        }
        return result;
    }

    /**
     * Метод перезаписи в файл
     */
    private static void reWriteToFile(String path){
        Map<String, Integer> map = readFromFile(path);
        List<String> toWrite = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            toWrite.add(entry.toString());
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            toWrite.add(key + "=" + value.toString());
        }
        writeToFile(path, toWrite);
    }
}