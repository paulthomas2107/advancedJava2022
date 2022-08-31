package com.pault.advjava.serialization;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DualGenericHolder<T, U> {

    T obj1;
    U obj2;

    public static void main(String[] args) {

        DualGenericHolder<String, Integer> obj1 = new DualGenericHolder<String, Integer>("Coder", 123);
        obj1.display();
        DualGenericHolder<String, String> obj2 = new DualGenericHolder<String, String>("Cool", "Beans");
        obj2.display();
    }

    public void display() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
