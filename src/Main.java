import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //Create the card deck
        Stack<Card> cardDeck = new Stack<Card>();
        //Hearts Diamonds Clubs Spades
        char[] suits = {'S', 'H', 'D', 'C'};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (char suit : suits) {
            for (String rank : ranks) {
                cardDeck.push(new Card(rank, suit));
            }
        }

        //Shuffle the card deck
        Collections.shuffle(cardDeck);

        //Number of players in the game
        int numOfPlayers = 4;

        //ArrayList storing all the players in the game
        ArrayList<Player> players = new ArrayList<Player>();
        for (int i = 0; i < numOfPlayers; i++) {
            Card[] closed = {cardDeck.pop(), cardDeck.pop(), cardDeck.pop()};
            Card[] open = {cardDeck.pop(), cardDeck.pop(), cardDeck.pop()};
            Card[] hand = {cardDeck.pop(), cardDeck.pop(), cardDeck.pop()};
            players.add(new Player(closed, open, hand));
        }
        System.out.println(players);
    }
}