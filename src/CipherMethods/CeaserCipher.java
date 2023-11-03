package CipherMethods;

public class CeaserCipher {
    public String EncryptStringCeaserCipher(String text,int key){
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        key - 65) % 26 + 65);
                result.append(ch);
            }
            else if(Character.isLowerCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        key - 97) % 26 + 97);
                result.append(ch);
            }
            else{
                result.append(text.charAt(i));

            }
        }
        return result.toString();
    }
    public String DecryptStringCeaserCipher(String text,int key){
        return this.EncryptStringCeaserCipher(text,26-key);
    }
    public String DecryptStringCeaserCipherBF(String text){
        System.out.println("Decrypting with all possible keys of ceaser cipher");
        String result="";
        for(int i=0;i<26;i++){
            result+="Decrypted text with key "+i+" is \n";
            result+=this.EncryptStringCeaserCipher(text,26-i);
            result+="\n";
        }
        return result;
    }
}

