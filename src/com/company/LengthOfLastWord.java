package com.company;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LengthOfLastWord {
    public int funclengthOfLastWord(String s) {

        Pattern patObj = Pattern.compile("[A-Za-z]+");
        Matcher mObj = patObj.matcher(s);
        String finalWord = "0";
        while(mObj.find())
        {
            finalWord = mObj.group(0);
        }
        if(finalWord=="0")
        {
            return 0;
        }
        else {
            return finalWord.length();
        }
    }
}
