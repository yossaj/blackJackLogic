import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;


    @Before
    public void before(){
        player = new Player("Ben");
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0, player.countCards());
    }

//    @Test
//    public void canPickUpCard(){
//        player.pickUpCard(card);
//        assertEquals(1, player.countCards());
//    }


}
