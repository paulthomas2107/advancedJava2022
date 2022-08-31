package com.pault.advjava.iostreams;

import java.io.*;

public class CharacterStreamDemo        {
    public static void main(String[] args) throws IOException {
        FileReader inStream = null;
        FileWriter outStream = null;

        try {
            inStream = new FileReader("example2.txt");
            outStream = new FileWriter("example2_out.txt");
            // Read byte at a time
            int content;
            while ((content = inStream.read()) != -1) {
                outStream.append((char) content);
            }
        } finally {
            if (inStream != null) {
                inStream.close();
            }
            if (outStream != null) {
                outStream.close();
            }
        }

        System.out.println("CharacterStreamDemo completed ok.....");
    }
}
