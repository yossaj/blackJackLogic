import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> newDeck;
    private int capacity;


    public Deck(){
        this.capacity = 52;
        this.newDeck = new ArrayList<Card>();
    }

    public int deckLength() {
        return this.newDeck.size();
    }

    public void addCardsToDeck() {
        for (int i = 0; i < CardSuit.values().length; i++) {
            for (int j = 0; j < CardRank.values().length; j++) {
                Card card = new Card(CardSuit.values()[i], CardRank.values()[j]);
                newDeck.add(card);
            }

        }

    }

    public void shuffleCards(){
        Collections.shuffle(this.newDeck);
    }

    public CardSuit checkFirstCard() {
        Card firstcard = this.newDeck.get(0);
        return firstcard.getSuit();
    }

    public Card removeTopCard() {
        return this.newDeck.remove(0);
    }
}
