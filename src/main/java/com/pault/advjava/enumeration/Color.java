package com.pault.advjava.enumeration;

public enum Color {

    RED("red"),
    GREEN("green"),
    BLUE("blue");

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    Color(String value) {
        this.value = value;
    }

    private String value;

}

