package models;

public class Decoding {
    private String input;
    private int key;

    public Decoding(String input,int key){
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
