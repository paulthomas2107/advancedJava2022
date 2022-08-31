package com.pault.advjava.generics;

import com.pault.advjava.serialization.Student;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SingleGenericHolder<T> {

    T obj;

    public static void main(String[] args) {

        SingleGenericHolder<Integer> iObj = new SingleGenericHolder<Integer>(10);
        SingleGenericHolder<String> sObj = new SingleGenericHolder<String>("Machine");
        SingleGenericHolder<Student> student = new SingleGenericHolder<Student>(new Student("Paul", 33, "Home", null));

        System.out.println(iObj.toString());
        System.out.println(sObj.toString());
        System.out.println(student);
    }

}