package Lesson3_2019_Week01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static String getPhoneNumber(String fullNumber) {
        Pattern pattern = Pattern.compile("[+]?(370|8)(6|5)(?<phonenumber>[0-9]+)");
        Matcher matcher = pattern.matcher(fullNumber);

        if (matcher.find()){
            return matcher.group("phonenumber");
        }
        else{
            return "";
        }
    }
    public static void main(String[] args){
        String number = "+3706555555";
        System.out.println("Number is: " + getPhoneNumber(number));
    }
}
