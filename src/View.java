import java.util.Objects;

public class View {
        private final HelperMethods helperMethods = new HelperMethods();
        public void run(){
            String login = helperMethods.promptString("Введите логин (только a,b,c,d,e,0,1,_): ");
            Integer passwordFirst = helperMethods.promptInt("Введите пароль (только цифры): ");
            Integer passwordSecond = helperMethods.promptInt("Повторите пароль: ");

            if(!helperMethods.checkLogin(login)){
                throw new RuntimeException("Логин содержит недопустимые символы!");
            }

            if(Objects.equals(passwordFirst, passwordSecond)) System.out.println("Вы вошли в систему!");
            else System.out.println("Логин или пароль указаны неверно.");
        }
}
