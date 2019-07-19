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




}
