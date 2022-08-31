package com.pault.advjava.enumeration;

public class Main {

    public static void main(String[] args) {

        // Use ENUM of Color
        Color c1 = Color.RED;
        System.out.println("Enum name: "+c1.name());
        System.out.println("Enum value: "+c1.getValue());
        for (Color c : Color.values()) {
            System.out.println("Enum name: "+c.getValue());
        }
    }
}
