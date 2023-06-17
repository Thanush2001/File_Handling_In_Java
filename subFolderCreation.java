package com.fileHandling;

import java.io.File;

public class subFolderCreation {
    public static void main(String[] args) {
        File obj=new File("C:\\Users\\vthan\\OneDrive\\Desktop\\fileHandlingDemo\\subFolder");
        boolean isPresent=obj.exists();
        if(isPresent==false){
            obj.mkdirs();
        }
        isPresent=obj.exists();
    }
}