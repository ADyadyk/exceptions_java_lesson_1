import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
        List<String> checkSymbols = new ArrayList<>();
        checkSymbols.add("a");
        checkSymbols.add("b");
        checkSymbols.add("c");
        checkSymbols.add("d");
        checkSymbols.add("e");
        checkSymbols.add("0");
        checkSymbols.add("1");
        checkSymbols.add("_");

        List<String> inputting = new ArrayList<>(Arrays.asList(login.split("")));
        inputting.removeIf(checkSymbols::contains);

        return inputting.isEmpty();
    }
}
