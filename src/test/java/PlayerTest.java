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
        player.addCard(card);
        assertEquals(1, player.cardCount());
    }

    @Test
    public void canGetHandValue() {
        player.addCard(card);
        assertEquals(1, player.getHandValue());
    }

}