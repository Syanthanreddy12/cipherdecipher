package userInputOutputHandler;
import fileHandler.fileOutputHandler;

public class userOutputHandler {

    public void generateOutputFile(int type, String filePath,String result) {
        String filepath2 = filePath;
        if(type==1) {
            filepath2 += "_decrypted";
        } else if (type==2) {
            filepath2 += "_decrypted";
        }
        else{
            filepath2+="_allDecrypted";
        }
        fileOutputHandler wr = new fileOutputHandler();
        wr.writetofile(filepath2, result);
    }
}
