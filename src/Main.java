import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack cardDeck = new Stack();
        //Hearts Diamonds Clubs Spades
        char[] suits = {'S', 'H', 'D', 'C'};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (char suit : suits) {
            for (String rank : ranks) {
                cardDeck.push(new Card(rank, suit));
            }
        }
    }
}