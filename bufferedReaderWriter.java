package com.fileHandling;

import java.io.*;
public class bufferedReaderWriter {
    public static void main(String[] args) {
        File obj=new File("C:\\Users\\vthan\\OneDrive\\Desktop\\dummy.txt");
        FileWriter fwriter=null;
        try {
            fwriter = new FileWriter(obj,true);
            BufferedWriter bwriter=new BufferedWriter(fwriter);
            bwriter.write("One");
            bwriter.newLine();
            bwriter.write("Two");
            bwriter.newLine();
            bwriter.write("Three");
            bwriter.newLine();
            bwriter.write("Four");
            bwriter.flush();
            bwriter.close();
            FileReader freader=new FileReader(obj);
            BufferedReader breader=new BufferedReader(freader);
            String line=breader.readLine();
            int lineCount=0;
            while(line!=null)
            {
                lineCount++;
                System.out.println(line);
                line=breader.readLine();
            }
            System.out.println("No of lines :" +lineCount);

        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
