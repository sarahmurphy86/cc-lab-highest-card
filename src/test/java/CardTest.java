import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    private Card card;

    @Before
    public void before(){
        card = new Card(SuitType.DIAMONDS, ValueType.KING);
    }

    @Test
    public void hasSuit() {
        assertEquals(SuitType.DIAMONDS, card.getSuit());
    }

    @Test
    public void hasValue() {
        assertEquals(ValueType.KING, card.getValue());
    }
}