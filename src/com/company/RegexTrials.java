package com.company;
import java.util.regex.Matcher;//Here is where the regex is passed as a input to find matches
import java.util.regex.Pattern;//Here is where the regex is compiled
import java.util.regex.MatchResult;
import java.util.regex.PatternSyntaxException;

public class RegexTrials {
    public Matcher createPatternAndReturnMatch(String regexpattern, String inputText)
    {
        System.out.println("Input String is : "+inputText);
        System.out.println("RegEx is : "+regexpattern);
        Pattern pObj = Pattern.compile(regexpattern);
        Pattern.compile(regexpattern);
        Matcher mObj = pObj.matcher(inputText);
        return mObj;
    }
}
