import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DeckTest {
    private Deck deck;
    private Card card;

    @Before
    public void before() {
        deck = new Deck();
        card = new Card(SuitType.HEARTS, ValueType.EIGHT);
    }

    @Test
    public void addCardToDeck(){
        deck.addCard(card);
        assertEquals(1, deck.cardCount());

    }
}