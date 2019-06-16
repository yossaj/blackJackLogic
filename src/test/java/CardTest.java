import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

        Card card;

        @Before
        public void before(){
                card = new Card(CardSuit.DIAMONDS, CardRank.ACE);
        }

        @Test
        public void canGetSuit(){
                assertEquals(CardSuit.DIAMONDS, card.getSuit());
        }

        @Test
        public void canGetRank(){
                assertEquals(CardRank.ACE, card.getRank());
        }

        @Test
        public void canGetValue(){
                assertEquals(1, card.getRankValue());
        }



}


