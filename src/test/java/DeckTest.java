import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before() {
        deck = new Deck();
        deck.addCardsToDeck();
    }

//    @Test
//    public void deckIsNotDeck(){
//        assertEquals(0, deck.deckLength());
//    }


    @Test
    public void canAddaDeck() {
        assertEquals(52, deck.deckLength());
    }

    @Test
    public void isntShuffled() {
        assertEquals(CardSuit.SPADES, deck.checkFirstCard());
    }

//    @Test
//    public void shuffled(){
//        deck.shuffleCards();
//        assertEquals(CardSuit.SPADES, deck.checkFirstCard());
//    }

    @Test
    public void canRemoveCard(){
        deck.removeTopCard();
        assertEquals(51, deck.deckLength());
    }
}
