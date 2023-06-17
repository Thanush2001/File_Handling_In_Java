package com.fileHandling;

import java.io.File;

public class listFileFolders {
    public static void main(String[] args) {
        File obj=new File("C:\\Users\\vthan\\OneDrive");
        String[] listingFileFolders = obj.list();
        for(int i=0;i< listingFileFolders.length;i++){
            System.out.println(listingFileFolders[i]);
        }
        System.out.println("============================================");
        File[] listingFiles = obj.listFiles();
        for(File f:listingFiles){
            if(f.isFile()){
                System.out.println(f);
            }
        }
        System.out.println("============================================");
        File[] listingFolders = obj.listFiles();
        for(File f:listingFolders){
            if(f.isDirectory()){
                System.out.println(f);
            }
        }
        System.out.println("============================================");
        System.out.println("LISTING ONLY PDF FILES");
        File[] listingTxtFiles = obj.listFiles();
        for(File f:listingTxtFiles){
            String fileName=f.getName();
            int lastDot = fileName.lastIndexOf(".");
            String extension=fileName.substring(lastDot+1);
            if(extension.equals("pdf")){
                System.out.println(fileName);
            }
        }
        System.out.println("============================================");
        System.out.println("LISTING ONLY PDF FILES < 1Mb");
        File[] listingTxtFile = obj.listFiles();
        for(File f:listingTxtFile){
            String fileName=f.getName();
            int lastDot = fileName.lastIndexOf(".");
            String extension=fileName.substring(lastDot+1);
            if(extension.equals("pdf")) {
                if(f.length()<1000000){
                    System.out.println(fileName + "size :"+f.length());
                }
            }
        }
    }
}