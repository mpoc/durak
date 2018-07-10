public class Card {
    String rank;
    char suit;

    public Card (String rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return rank + suit;
    }
}