public class Game {

    private Deck deck;

    Game(){
        deck = new Deck();
        populateDeck();
    }

    public int countDeck(){
      return deck.cardCount();
    }

    private void populateDeck() {
        for (SuitType suit : SuitType.values()) {
            for (ValueType value : ValueType.values()) {
                deck.addCard(new Card(suit, value));
            }
        }
    }
}
