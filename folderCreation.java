package com.fileHandling;
import java.io.File;
public class folderCreation {
    public static void main(String[] args) {
        File obj=new File("C:\\Users\\vthan\\OneDrive\\Desktop\\fileHandlingDemo");
        boolean isPresent=obj.exists();
        System.out.println("IS FOLDER IS FOUND : " + isPresent);
        if(isPresent==false){
            obj.mkdir();
        }
        isPresent=obj.exists();
        System.out.println("IS FOLDER IS FOUND : " + isPresent);
    }
}

