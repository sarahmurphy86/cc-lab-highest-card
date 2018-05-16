import java.util.ArrayList;
import java.util.Random;

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

    public Card takeCard() {
        Random rand = new Random();
        int randomCardIndex = rand.nextInt(this.cardCount() - 1);
        return cards.remove(randomCardIndex);
    }
}
