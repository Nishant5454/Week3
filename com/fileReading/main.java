package com.fileReading;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        String filePath="Name.txt";
        fileReading.LargefileReading largefileReading=new fileReading.LargefileReading();
        largefileReading.readingByInputStreamReader(filePath);
        largefileReading.readingbyFileReader(filePath);

    }

}
