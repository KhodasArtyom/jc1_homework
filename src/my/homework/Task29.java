package my.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void main(String[] args) {
        SearchNumbers searchNumbers = new SearchNumbers();
        searchNumbers.searchNumbers();

    }
}
class SearchNumbers {

    public void searchNumbers() {
        String str = "0x9BFF <p id=p1> 0x8ACF <p id=p1> abcd  ght xyz";
        System.out.println(str.replaceAll("<p id=p1>", "<p>"));
        Pattern p = Pattern.compile("0x[A-Fa-f0-9]");
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.start() + " " + m.end());

        }
    }
}