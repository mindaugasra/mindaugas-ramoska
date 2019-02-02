package Lesson3_2019_Week01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample02 {
    public static boolean isHexNumber(String number){
        Pattern pattern = Pattern.compile("(0x)?([0-9A-F]+)");
        Matcher matcher = pattern.matcher(number);
        // matcher.matches() - adds ^ at hte start and $ at the end
        // matcher.find() - just run your regex
        return matcher.matches();
    }
    public static void main(String[] args){
        String[] examples = {"1FFA", "0xBF", "H42", "82G"};
        for(String number : examples){
            if (isHexNumber(number)){
                System.out.println(number + " is OK");
            }
            else {
                System.out.println(number + " is not hex number");
            }
        }
    }
}
