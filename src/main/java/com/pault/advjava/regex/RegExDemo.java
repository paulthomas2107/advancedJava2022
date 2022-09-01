package com.pault.advjava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

    public static void main(String[] args) {

        String regexStr = ".*[a-z][0-9].";
        String name = "Paul Alan Thomas";
        String nameRegex = "(?<![\\w\\d])Alan(?![\\w\\d])";

        Pattern pattern = Pattern.compile(regexStr);
        Matcher matcher = pattern.matcher("123435646adadaf242341234");

        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("No match found");
        }

        // Name matcher
        pattern = Pattern.compile(nameRegex);
        matcher = pattern.matcher(name);
        matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("No match found");
        }



    }
}
