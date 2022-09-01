package com.pault.advjava.nonblockingio;

import lombok.extern.java.Log;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

@Log
public class NIOExample {

    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("source.txt");
        FileChannel readChannel = fin.getChannel();
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        int result = readChannel.read(readBuffer);
        System.out.println("File read successfully....");

        FileOutputStream fout = new FileOutputStream("source_out.txt");
        FileChannel writeChannel = fout.getChannel();
        ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
        String message = "Caitlin and Rory";
        writeBuffer.put(message.getBytes());
        writeBuffer.flip();
        writeChannel.write(writeBuffer);
        System.out.println("File written successfully....");

        log.info("NIOExample has finished.....");


    }
}
