import java.util.ArrayList;

public class Player {
    
    private ArrayList<Card> cards;

    Player() {
        this.cards = new ArrayList<>();
    }

    public int cardCount() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public int getHandValue() {
        int handValue = 0;

        for (Card card : this.cards){
            handValue += card.value.getValue();
        }

        return handValue;
    }
}
