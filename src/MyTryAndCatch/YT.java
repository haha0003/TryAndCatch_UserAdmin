package MyTryAndCatch;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class YT {
    public static void main(String[] args) {
        new YT().run();
    }

    private void run() {
        readFileCameFirst();
    }

    //Read a file after making it first
    public void readFileCameFirst(){
        try {
            Scanner reader = new Scanner(new File("DaFileCameFirst"));
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }reader.close();
        } catch (IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }

    //Make a new file and write in it
    public void makeAFileAndWriteInIt(){
        try {
            PrintStream print = new PrintStream(new File("Daddy's House"));
            print.println("U in my house now");
            print.print("So suck ittttt");
            print.close();
        } catch (IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }

}
