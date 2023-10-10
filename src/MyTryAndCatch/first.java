package MyTryAndCatch;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        new first().run();
    }

    private void run() {
    }

    //Create a file
    public void createFile(){
        try{
            File firstFile = new File("OMGAFile.txt");
            if (firstFile.createNewFile()){
                System.out.println("File created: " + firstFile.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }

    //Write in file
    public void writeInFile(){
        try {
            FileWriter firstWriter = new FileWriter("OMGAFile.txt");
            firstWriter.write("OMG THIS IS SOME BS");
            firstWriter.write("\nAlso you are a real C U Next Tuesday");
            firstWriter.close();
            System.out.println("You successfully wrote in the file");
        } catch (IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }

    //Read what is in a file
    public void whatIsInFile(){
        try {
            Scanner firstReader = new Scanner(new File("OMGAFile.txt"));
            while (firstReader.hasNextLine()){
                String data = firstReader.nextLine();
                System.out.println(data);
            } firstReader.close();
        } catch (IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }

    //File information
    public void fileInfo(){
        File firstInfo = new File("OMGAFile.txt");
        if (firstInfo.exists()){
            System.out.println("File name: " + firstInfo.getName());
            System.out.println("Absolute path: " + firstInfo.getAbsolutePath());
            System.out.println("Writable: " + firstInfo.canWrite());
            System.out.println("Readable: " + firstInfo.canWrite());
            System.out.println("File size in bytes: " + firstInfo.length());
        } else {
            System.out.println("File does not exist");
        }
    }



}