import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    Deck() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int cardCount(){
        return cards.size();
    }
}
