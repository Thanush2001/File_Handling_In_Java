package com.fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class countEachCharacter
{
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\vthan\\OneDrive\\Desktop\\dummy.txt");
        try {
            obj.createNewFile();
            FileWriter writer = new FileWriter(obj);
            writer.write("Hi...I am Thanush");
            writer.flush();
            writer.close();
            FileReader reader=new FileReader(obj);
            char ch[]=new char[(int)obj.length()];
            System.out.println("Count of each characters : "+ch.length);
            reader.read(ch);
            for(char ch1 : ch)
                System.out.print(ch1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}