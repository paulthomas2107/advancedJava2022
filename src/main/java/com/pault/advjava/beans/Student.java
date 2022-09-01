package com.pault.advjava.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.java.Log;

import java.io.Serializable;

@Log
@Data
@AllArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String address;
}
