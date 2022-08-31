package com.pault.advjava.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException {

        FileInputStream inStream = null;
        FileOutputStream outStream = null;

        try {
            inStream = new FileInputStream("example1.txt");
            outStream = new FileOutputStream("example1_out.txt");
            // Read byte at a time
            int content;
            while ((content = inStream.read()) != -1) {
                outStream.write((byte) content);
            }
        } finally {
          if (inStream != null) {
              inStream.close();
          }
          if (outStream != null) {
              outStream.close();
          }
        }

        System.out.println("ByteStreamExample completed ok.....");
    }
}
