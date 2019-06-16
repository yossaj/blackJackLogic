import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Deck deck;
    Dealer dealer;

    @Before
    public void before(){
        deck = new Deck();
        dealer = new Dealer();
        dealer.pullOutMyDeck();
    }

    @Test
    public void dealerHasFullDeck(){
        assertEquals(52, dealer.myDeckLength());
    }

    @Test
    public void dealCard(){
        this.dealer.dealOne();
        assertEquals(51, dealer.myDeckLength());
    }

    @Test
    public void dealerHasCard(){
        this.dealer.dealSelf();
        assertEquals(1, dealer.countMyHand());
    }
}
