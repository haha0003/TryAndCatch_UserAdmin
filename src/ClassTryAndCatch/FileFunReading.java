package ClassTryAndCatch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileFunReading {
    public static void main(String[] args) {
        new FileFunReading().run();
    }

    private void run() {
        readFile();
    }

    public void readFile(){
        try {
            Scanner sc = new Scanner(new File ("FileFunReading.txt"));
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            } sc.close();
            } catch (IOException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }

}
