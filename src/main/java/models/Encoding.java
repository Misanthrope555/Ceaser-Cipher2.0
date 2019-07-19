package models;

public class Encoding {
    private String input;
    private int key;

    public Encoding(String input,int key){
        this.input=input;
        this.key=key;
    }
    public String getInput(){
        return input;
    }

    public int getKey(){
        return key;
    }

    public String encode(){
        String encodeword="";
        for (int i=0;i < getInput().length();i++){

            char character = this.input.charAt(i);

            char encode=(char)(character + getKey());

            encodeword+= encode;


        }
        return  encodeword;

    }




}
