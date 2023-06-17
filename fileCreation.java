package com.fileHandling;
import java.io.File;
import java.io.IOException;

public class fileCreation {
    public static void main(String[] args) {
        File obj=new File("C:\\Users\\vthan\\OneDrive\\Desktop\\Demo.txt");

        /* obj.delete();*/ // File Deletion
        boolean isPresent=obj.exists();
        if(isPresent==false){
            try {
                obj.createNewFile();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            System.out.println("Demo file sucessfully created");
        }
        File obj1=new File("C:\\Users\\vthan\\OneDrive\\Desktop\\new Demo.txt");
        boolean renameOutput=obj.renameTo(obj1);
        System.out.println("rename Demo file sucessfully created");
        System.out.println(renameOutput);
       /* System.out.println(obj.getName());     //Printing file Name
        System.out.println(obj1.getName());*/
    }
}
