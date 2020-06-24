import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        String regex = "^([1-9]|0[1-9]|(1|2)[0-9]|3[01])[\\s-.]([1-9]|0[1-9]|1[012])[\\s-.](19|20)?\\d{2}$";
        Pattern pattern = Pattern.compile(regex);

        Matcher m = pattern.matcher(dateString);

        return m;
    }
}
