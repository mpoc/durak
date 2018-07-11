public class Player {
    Card[] closed = new Card[3];
    Card[] open = new Card[3];
    Card[] hand = new Card[3];

    public Player(Card[] closed, Card[] open, Card[] hand) {
        this.closed = closed;
        this.open = open;
        this.hand = hand;
    }

    public String toString() {
        return "closed: " + closed[0] + " " + closed[1] + " " + closed[2] + "\n" +
                "open: " + open[0] + " " + open[1] + " " + open[2] + "\n" +
                "hand: " + hand[0] + " " + hand[1] + " " + hand[2] + "\n";
    }
}
