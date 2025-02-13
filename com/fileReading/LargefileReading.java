package com.fileReading;

import java.io.*;

public class LargefileReading {
    public void readingbyFileReader(String filePath) throws FileNotFoundException {
        long startTime;
        long endTime;
        startTime=System.nanoTime();
        try(FileReader fileReader=new FileReader(filePath);){
            int ch;
            while ((ch = fileReader.read())!=-1);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        endTime=System.nanoTime();
        System.out.println("Time taken by InputStreamReader is "+(endTime-startTime)/1e6+ "ms");
    }
    public void readingByInputStreamReader(String filePath) throws IOException {
        long startTime;
        long endTime;
        startTime=System.nanoTime();
        try(FileInputStream fileInputStream=new FileInputStream(filePath);
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream)){
            int ch;
            while ((ch=inputStreamReader.read())!=-1);


        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        endTime=System.nanoTime();
        System.out.println("The time taken by FileInputStreamBuffer is "+(endTime-startTime)/1e6+"ms");


    }
}
