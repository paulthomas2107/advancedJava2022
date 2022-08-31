package com.pault.advjava;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String address;

}
