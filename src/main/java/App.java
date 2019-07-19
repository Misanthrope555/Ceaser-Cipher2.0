import models.Encoding;

import java.util.Scanner;
public class App {
    public static void main(String []args){
        Scanner read = new Scanner(System.in);



        System.out.println("-------------WELCOME TO CEASER CIPHER-------");
        System.out.println("                                            ");
        System.out.println("Reply with the following options :\n" +
                " 1) Ecrypt a word\n" +
                " 2) Decrypt a word\n" +
                " 3) Exit a program");
        String userword= read.next();

        if(userword.equals("1")){
            System.out.println("Enter the word you want to Encrypt:");
            String userWord= read.next();
            System.out.println("Enter the key you want for Encryption");
            int userInt= read.nextInt();

            Encoding userEncrypt= new Encoding(userWord,userInt);
            String encryption= userEncrypt.encode();
            System.out.println("Your word was encrypted to:");
            System.out.println(encryption);
        }







    }
}
