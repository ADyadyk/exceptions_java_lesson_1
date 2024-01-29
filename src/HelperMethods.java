import java.util.*;
import java.util.regex.Pattern;

public class HelperMethods implements HelperMethodable {
    @Override
    public String promptString(String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    @Override
    public Integer promptInt(String message){
        try {
            return Integer.parseInt(promptString(message));
        } catch (RuntimeException e){
            return promptInt("Введен не корректный пароль! Повторите попытку: ");
        }
    }

    @Override
    public boolean checkLogin(String login){
        String regex = "[[abcde][_][01]]*";
        Pattern pattern = Pattern.compile(regex); // Создаём регулярное выражение
        return pattern.matcher(login).matches(); //
    }

    public boolean askAgain(){
        String temp = promptString("Ещё раз войти? (y/n)");
        return !Objects.equals(temp, "n");
    }
}
