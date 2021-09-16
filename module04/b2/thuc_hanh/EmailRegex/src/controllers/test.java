package controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    private static final  String EMAIL_REGEX = "^[\\\\w!#$%&'*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$";
    private static Pattern pattern;
    private static Matcher matcher;
    public static void main(String[] args) {

        String email = "john123@gmail.com";
        System.out.println("The E-mail ID is: " + email);
        System.out.println("Is the above E-mail ID valid? " + isValid(email));


    }
    static boolean isValid(String email) {
        String regex = "^[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}$";
        return email.matches(regex);
    }
}
