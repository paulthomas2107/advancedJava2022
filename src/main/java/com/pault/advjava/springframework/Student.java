package com.pault.advjava.springframework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
@AllArgsConstructor
public class Student {

    private String name;
    private String address;
    private int age;
}
