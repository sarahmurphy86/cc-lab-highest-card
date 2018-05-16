public class Player {
    
    private Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getHandValue() {
        return this.card.value.getValue();
    }
}
