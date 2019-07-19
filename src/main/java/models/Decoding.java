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
    public String decode(){
        String results= "";
        for(int i=0;i<getInput().length();i++){

            char character = this.input.charAt(i);

            char decrypt = (char) (character-getKey());

            results+= decrypt;
        }
        return results;
    }
}
