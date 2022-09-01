package com.pault.advjava.stringhandling;

import java.util.ArrayList;
import java.util.Arrays;

public class StringHandlingDemo {

    public static void main(String[] args) {

        String str1 = "John is studying";
        String str2 = " in college";
        System.out.println(str1.length());

        String result = str1.concat(str2);
        System.out.println(result);

        String fmt = String.format("The name of the student is " + "%s and their age is " + "%d.", "John", 21);
        System.out.println(fmt);

        System.out.println(str1.charAt(5));

        if (str1.equals(str2)) {
            System.out.println("Str1 and Str2 are the same");
        } else {
            System.out.println("Str1 and Str2 are different");
        }

        System.out.println(str1.indexOf('y'));

        System.out.println(str1.replace('s', 'r'));

        String[]  arr = str1.split(" ");
        Arrays.asList(arr).forEach(s -> System.out.println(s));

        String newStr1 = str1.substring(1, 5);
        System.out.println(newStr1);
    }
}
