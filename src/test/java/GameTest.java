import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    Game game;
    Player player;

    @Before
    public void before() {
        game = new Game();
        player = new Player();
    }

    @Test
    public void canPopulateDeck() {
        assertEquals(52, game.countDeck());
    }

    @Test
    public void canAddPlayer() {
        game.addPlayer(player);
        assertEquals(1, game.playerCount());
    }

    @Test
    public void canDealCardToPlayers() {
        Player anotherPlayer = new Player();
        game.addPlayer(player);
        game.addPlayer(anotherPlayer);

        game.deal(1);

        assertEquals(50, game.countDeck());
    }
}