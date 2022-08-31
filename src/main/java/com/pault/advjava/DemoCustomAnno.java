package com.pault.advjava;

import java.lang.reflect.Method;

public class DemoCustomAnno {

    @MyCustomAnnotation(value = 217, name="Paul T")
    @Dog(action = "Woof")
    public void sayHello() {
        System.out.println("My Custom Annotation");
    }
    public static void main(String[] args) throws Exception{

        DemoCustomAnno d = new DemoCustomAnno();
        Method m = d.getClass().getMethod("sayHello");

        MyCustomAnnotation mca = m.getAnnotation(MyCustomAnnotation.class);
        Dog dog = m.getAnnotation(Dog.class);

        System.out.println("Value from annotation is : "+mca.value());
        System.out.println("Name  from annotation is : "+ mca.name());
        System.out.println("Dog says : "+ dog.action());

    }
}
