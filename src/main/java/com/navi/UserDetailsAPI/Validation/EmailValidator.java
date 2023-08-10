package com.navi.UserDetailsAPI.Validation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator
{
    // Function to validate the email address.
    public static boolean isValidEmail(String email) {
        String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}


