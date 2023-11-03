package fileHandler;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileInputhandler {
    public boolean checkFileAvailablity(String s){
        File file = new File(s);
        //System.out.println(file.exists());
        return file.exists();
    }
    public String readFileContent(String s){
        String str="";

        int i;
        try {
            FileReader fr = new FileReader(s);
            while ((i = fr.read()) != -1)
                str += (char) i;
            //System.out.println(str);
            fr.close();

        }
        catch (IOException e){
            // Print and display message
            System.out.println("There are some IOException inside readfilecontent");
        }
        return str;
    }

}
