package userInputOutputHandler;
import CipherMethods.CeaserCipher;
import fileHandler.fileInputhandler;
import fileHandler.fileOutputHandler;
import java.util.Scanner;

public class userInputHandler {

    public void takeUserInput(){
        Scanner inputobj = new Scanner(System.in);
        int optionselected;
        while(true) {
            System.out.println("Enter the necessary action needed");
            System.out.println("1.Encrypt a text file using a key(Ceaser Cipher)");
            System.out.println("2. Decrypt a text file using a key (Ceaser Cipher)");
            System.out.println("3. Decrypt a text file using all possible keys(Brute Force)");

            optionselected = inputobj.nextInt();
            if(optionselected<=3 && optionselected>0){
                break;
            }
            else{
                System.out.println("Please select value in 1,2,3");
            }
        }
        System.out.println("Please give absolute path of the file");
        inputobj.nextLine();
        String filePath="";
        fileInputhandler rd = new fileInputhandler();
        while(true) {
            filePath = inputobj.nextLine();

            if(rd.checkFileAvailablity(filePath))
                break;
            else{
                System.out.println("Invalid file path Please Enter correct filepath");
            }
        }
        System.out.println("");
        int key=0;
        if(optionselected == 1 || optionselected == 2 ) {
            System.out.println("Plese enter key");
            while(true) {
                key = inputobj.nextInt();
                if(key>=0 && key<26){
                    break;
                }
                else{
                    System.out.println("Please select key between 0 and 25");
                }
            }
        }
        String s1=rd.readFileContent(filePath);
        String result="";
        CeaserCipher cc= new CeaserCipher();
        if(optionselected==1){
            result=cc.EncryptStringCeaserCipher(s1,key);
        } else if (optionselected==2) {
            result=cc.DecryptStringCeaserCipher(s1,key);
        }
        else{
            result=cc.DecryptStringCeaserCipherBF(s1);
        }
        System.out.println("result is "+result);

        userOutputHandler outPut= new userOutputHandler();
        outPut.generateOutputFile(optionselected,filePath,result);



    }
}
