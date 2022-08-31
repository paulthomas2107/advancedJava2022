package com.pault.advjava.autoboxing;

public class AutoboxingDemo {

    public static void main(String[] args) {
        int i = 10;

        // Autobox
        Integer iObj= Integer.valueOf(i);
        System.out.println("Val of Integer obj: "+iObj);

        // Auto-unbox
        int i1 = iObj;
        System.out.println("Val of i1: "+i1);

        //Autobox
        Character charObj = 'a';

        // Auto-unbox
        char ch = charObj;
        System.out.println("Val of ch: "+ch);
        System.out.println("Val of charObj: "+charObj);

    }
}
