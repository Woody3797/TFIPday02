package day02workshop.src;

import java.util.Random;

public class Card {
    
    private int value;
    private String face;
    private static String[] faces = {"hearts", "spades", "diamonds", "clubs"};

    Random rand = new Random();

    public Card() {
        this.value = rand.nextInt(13) + 1;
        this.face = faces[rand.nextInt(4)];
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    @Override
    public String toString() {
        return "Card [value=" + value + ", face=" + face + "]";
    }

    
    
  
}
