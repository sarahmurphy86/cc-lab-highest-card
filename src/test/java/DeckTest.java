import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DeckTest {
    private Deck deck;
    private Card eightOfHearts;

    @Before
    public void before() {
        deck = new Deck();
        eightOfHearts = new Card(SuitType.HEARTS, ValueType.EIGHT);
    }

    @Test
    public void addCardToDeck(){
        deck.addCard(eightOfHearts);
        assertEquals(1, deck.cardCount());

    }

    @Test
    public void canTakeCardFromDeck() {
        Card sevenOfHearts = new Card(SuitType.HEARTS, ValueType.SEVEN);
        Card fiveOfHearts = new Card(SuitType.HEARTS, ValueType.FIVE);

        deck.addCard(eightOfHearts);
        deck.addCard(sevenOfHearts);
        deck.addCard(fiveOfHearts);

        deck.takeCard();

        assertEquals(2, deck.cardCount());
    }
}