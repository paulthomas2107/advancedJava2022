package com.pault.advjava.lang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(5);

        for (int i = 1; i <= new Random().nextInt(10)+1; i++) {
            arrayList.add(new Random().nextInt(10)+1);
        }

        System.out.println(arrayList);
    }
}
