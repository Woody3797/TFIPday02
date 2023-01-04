package day02workshop.src;


public class Main {
    
    public static void main(String[] args) {
        
        Deck deck = new Deck(52);
        deck.remove();

        deck.pick(3);
    }
}
