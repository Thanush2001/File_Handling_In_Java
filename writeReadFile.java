package com.fileHandling;

import java.io.*;

public class writeReadFile {
    public static void main(String[] args) {
        File obj=new File("C:\\Users\\vthan\\OneDrive\\Desktop\\fileHandlingDemo\\subFolder\\dummy.txt");
        try {
            obj.createNewFile();
            FileWriter writer = new FileWriter(obj);
            writer.write("This is the first line");
            writer.flush();
            writer.close();
            FileReader reader=new FileReader(obj);
            int output= reader.read();
            while(output!=-1){
                System.out.print((char)output);
                output=reader.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
