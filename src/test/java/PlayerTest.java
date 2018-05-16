import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    private Player player;
    private Card card;

    @Before
    public void before(){
        player = new Player();
        card = new Card(SuitType.SPADES, ValueType.ACE);
    }

    @Test
    public void playerCanHoldCard(){
        player.setCard(card);
        assertEquals(card, player.getCard());
    }

    @Test
    public void canGetHandValue() {
        player.setCard(card);
        assertEquals(1, player.getHandValue());
    }

}