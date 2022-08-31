package com.pault.advjava.serialization;

import java.io.*;

public class SerialDeserialDemo {

    public static void main(String[] args) {

        Student student = new Student("Paul", 55, "Cheshire", "Hello");

        String filename = "test.txt";
        FileOutputStream fileOut;
        ObjectOutputStream objOut;

        // Serialize
        try {
            File file = new File(filename);
            System.out.println("Location : "+file.getAbsolutePath());
            fileOut = new FileOutputStream(file);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);
            objOut.close();
            fileOut.close();
            System.out.println("Object has been serialized: "+student);
        } catch (IOException e) {
            System.out.println("Exception : "+e);
        }

        // Deserialize
        FileInputStream fileIn;
        ObjectInputStream objIn;
        try {
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);
            Student object = (Student) objIn.readObject();
            System.out.println("Object has been deserialized: "+object);
            objIn.close();
            fileIn.close();
        }   catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }

    }

