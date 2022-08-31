package com.pault.advjava;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String address;
    transient String notToBeSerialized;

}
