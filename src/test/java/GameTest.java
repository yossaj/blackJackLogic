import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Dealer dealer;
    Player player;
    Card card;
    Card card2;
    Card card3;

    @Before
    public void before(){
        player = new Player("Jim");
        dealer = new Dealer();
        game = new Game(player, dealer);
        game.dealerGetsReady();

    }

    @Test
    public void playerCanPickUpCard(){
        game.playerGetsCard();
        assertEquals(1, game.playerConfirmsHandSize());
    }

    @Test
    public void DealerCanDealSelf(){
        game.dealerGetsCard();
        assertEquals(1, game.dealerCountsHand());
    }

//    @Test
    public void CanCompareCardValues(){
        game.playerGetsCard();
        game.dealerGetsCard();
        assertEquals(false, game.playersCardIsHighest());
    }

    @Test
    public void CanDealForBlackJack(){
        game.blackJackDeal();
        assertEquals(2, game.playerConfirmsHandSize());
        assertEquals(2, game.dealerCountsHand());
    }

    @Test
    public void CanCalculatePlayerHandTotal(){
        card = new Card(CardSuit.CLUBS, CardRank.ACE);
        card2 = new Card(CardSuit.DIAMONDS, CardRank.EIGHT);
        card3 = new Card(CardSuit.DIAMONDS, CardRank.JACK);
        player.pickUpCard(card);
        player.pickUpCard(card2);
        player.pickUpCard(card3);
        assertEquals(19, player.handValue());
    }

    @Test
    public void CanCompare2HandValues(){
        card = new Card(CardSuit.CLUBS, CardRank.KING);
        card2 = new Card(CardSuit.DIAMONDS, CardRank.KING);
        player.pickUpCard(card);
        player.pickUpCard(card2);
        dealer.dealSelf();
        dealer.dealSelf();
        assertEquals(true, game.playersHandIsHigher());
    }

    @Test
    public void ReturnsFalseIfBust(){
        card = new Card(CardSuit.CLUBS, CardRank.KING);
        card2 = new Card(CardSuit.DIAMONDS, CardRank.KING);
        card3= new Card(CardSuit.DIAMONDS, CardRank.KING);
        player.pickUpCard(card);
        player.pickUpCard(card2);
        player.pickUpCard(card3);
        dealer.dealSelf();
        dealer.dealSelf();
        assertEquals(false, game.playersHandIsHigher());
    }

    @Test
    public void aDealerTwistsIf(){
        game.blackJackDeal();
        assertEquals(3, game.dealerCountsHand());
    }

    
}
