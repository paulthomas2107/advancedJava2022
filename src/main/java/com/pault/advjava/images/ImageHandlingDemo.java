package com.pault.advjava.images;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandlingDemo {

    public static void main(String[] args) throws IOException {

        int width = 426;
        int height = 640;

        BufferedImage image = null;

        image = readFromFile(width, height, image);

        writeToFile(image);
    }

    private static BufferedImage readFromFile(int width, int height, BufferedImage image) {
        try {

            File sampleFile = new File("sample.jpg");
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(sampleFile);

            System.out.println("Read successful: "+image);

        } catch (IOException e) {
            System.out.println("File read failed: "+e);
        }

        return image;
    }

    private static void writeToFile(BufferedImage image) {

        try {

            File output = new File("out.jpg");
            ImageIO.write(image, "jpg", output);

            System.out.println("File written successfully");

        } catch(IOException e) {
            System.out.println("File read failed: "+e);
        }


    }

}


