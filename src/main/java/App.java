import models.Decoding;
import models.Encoding;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean isProgrammingRunning = true;


        System.out.println("-------------WELCOME TO CEASER CIPHER-------");
        System.out.println("                                            ");
        System.out.println("Reply with the following options :\n" +
                " 1) Ecrypt a word\n" +
                " 2) Decrypt a word\n" +
                " 3) Exit a program");
        String userword = read.next();

        while (isProgrammingRunning) {

            if (userword.equals("1")) {
                System.out.println("Enter the word you want to Encrypt:");
                String userWord = read.next();
                System.out.println("Enter the key you want for Encryption");
                String userInt = read.next();
                int userint= Integer.parseInt(userInt);

                Encoding userEncrypt = new Encoding(userWord ,userint);
                String encryption = userEncrypt.encode();
                System.out.println("Your word was encrypted to:");
                System.out.println(encryption);
            } else if (userword.equals("2")) {
                System.out.println("Enter the word you want to decrypt");
                String userinput = read.next();
                System.out.println("Enter the key you want to encrypt with:");
                int userkey = read.nextInt();

                Decoding decrypt = new Decoding(userinput, userkey);
                String decryptword = decrypt.decode();
                System.out.println(decryptword);

            } else if (userword.equals("3")) {
                System.out.println("Are you sure you want to exit? \n" +
                        "Yes\n" +
                        "No");
                String exitoption = read.next();
                if (exitoption.equals("Yes")) {
                    isProgrammingRunning = false;
                } else if (exitoption.equals("No")) {
                    isProgrammingRunning = true;
//                } else {
//                    isProgrammingRunning=false;
//                }

                } else {
                    System.out.println("Invalid choice! Please recheck the options given by the program");
                }


            }
        }
    }
}
