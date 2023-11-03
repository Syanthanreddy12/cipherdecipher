package fileHandler;
import java.io.FileWriter;
import java.io.IOException;


public class fileOutputHandler {
    public void writetofile(String path,String s){
        try {

            FileWriter fw = new FileWriter(path);
            fw.write(s);
            fw.close();
        }
        catch (IOException e) {
            System.out.println("There are some IOException");
        }
    }
}
