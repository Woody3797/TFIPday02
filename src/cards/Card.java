package day02workshop.src.cards;

public class Card {
    
    private String suit;
    private int value;
    private String name;

    public Card(String suit, int value, String name) {
        this.suit = suit;
        this.value = value;
        this.name = name;
    }
    
    public String getSuit() {
        return suit;
    }
    public int getValue() {
        return value;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Card [suit=" + suit + ", value=" + value + ", name=" + name + "]";
    }

    
}
