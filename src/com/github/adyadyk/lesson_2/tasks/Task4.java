package com.github.adyadyk.lesson_2.tasks;

import java.io.*;

/**
 * Заставьте выполниться следующий код
 */
public class Task4 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String str = strings[1];
            test(); // при выполнении данного метода программа выбросит исключение
            int a = 1 / 0; // до этой строчки кода программа не дойдёт
            inputStream = new FileInputStream("sdafgdsaf"); // до этой строчки кода программа не дойдёт
        }
        catch (StackOverflowError error) {
            System.err.println("stack overflow error"); // будет выведено в консоль
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Я все равно выполнился!"); // будет выведено в консоль
        }
        System.out.println("Я жив!"); // будет выведено в консоль
    }
    private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}
