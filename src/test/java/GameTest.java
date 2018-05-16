import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    Game game;
    Player player1;
    Player player2;

    @Before
    public void before() {
        game = new Game();
        player1 = new Player();
        player2 = new Player();
    }

    @Test
    public void canPopulateDeck() {
        assertEquals(52, game.countDeck());
    }

    @Test
    public void canAddPlayer() {
        game.addPlayer(player1);
        assertEquals(1, game.playerCount());
    }

    @Test
    public void canDealCardToPlayers() {
        game.addPlayer(player1);
        game.addPlayer(player2);

        game.deal(1);

        assertEquals(50, game.countDeck());
        assertEquals(1, player1.cardCount());
        assertEquals(1, player2.cardCount());
    }

    @Test
    public void canDealTwoCardsToPlayers() {
        game.addPlayer(player1);
        game.addPlayer(player2);

        game.deal(2);

        assertEquals(48, game.countDeck());
        assertEquals(2, player1.cardCount());
        assertEquals(2, player2.cardCount());
    }

    @Test
    public void canCheckWinner() {
        Card card1 = new Card(SuitType.DIAMONDS, ValueType.KING);
        Card card2 = new Card(SuitType.DIAMONDS, ValueType.JACK);
        player1.addCard(card1);
        player2.addCard(card2);
        game.addPlayer(player1);
        game.addPlayer(player2);

        assertEquals(player1, game.winner());
    }
}