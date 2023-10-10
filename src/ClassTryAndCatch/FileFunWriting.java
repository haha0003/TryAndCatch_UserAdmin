package ClassTryAndCatch;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class FileFunWriting {
    public static void main(String[] args) {
        new FileFunWriting().run();
    }

    private void run() {
        makeAndWrite();
    }

    public void makeAndWrite(){
        File file = new File("OurParty.txt");
        try {
            PrintStream print = new PrintStream(file);
            print.println("Sup babeyyy");
            print.print("Take me out to dinnerr");
            print.close();
        } catch (IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }

}
