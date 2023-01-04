package day02workshop.src;

public class Deck {
    
    private int number;
    private Card card;
    
    public Deck(int number) {
        this.number = number;
    }

    public Deck(int number, Card card) {
        this.number = number;
        this.card = card;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void shuffle() {
        System.out.println("shuffling cards");
        Card card = new Card();
        System.out.println(card + " selected");

    }

    public void pick(int n) {
        for (int i = 0; i < n; i++) {
            Card card = new Card();
            System.out.println(card);
        }
    }

    public void remove() {
        number--;
        System.out.println("deck has " + number + " cards left");
    }
    
}
