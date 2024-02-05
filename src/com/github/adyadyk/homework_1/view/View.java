package com.github.adyadyk.homework_1.view;

import com.github.adyadyk.homework_1.view.implHelperMethods.HelperMethods;

import java.util.Objects;

public class View {
        private final HelperMethods helperMethods = new HelperMethods();
        public void run(){
                boolean flag = true;
                while (flag){
                    String login = helperMethods.promptString("Введите логин (только a,b,c,d,e,0,1,_): ");
                    Integer passwordFirst = helperMethods.promptInt("Введите пароль (только цифры): ");
                    Integer passwordSecond = helperMethods.promptInt("Повторите пароль: ");

                    if (!helperMethods.checkLogin(login)) {
                        throw new RuntimeException("Логин содержит недопустимые символы!");
                    }

                    if(!Objects.equals(passwordFirst, passwordSecond)){
                        System.out.println("Логин или пароль указаны неверно.");
                    }
                    else{
                        System.out.println("Вы вошли в систему!");
                    }
                    flag = helperMethods.askAgain();
                }
        }
}
