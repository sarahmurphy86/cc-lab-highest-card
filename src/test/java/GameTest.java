import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    Game game;

    @Before
    public void before() {
        game = new Game();
    }

    @Test
    public void canPopulateDeck() {
        assertEquals(52, game.countDeck());
    }
}