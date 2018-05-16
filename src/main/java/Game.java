import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    Game(){
        deck = new Deck();
        players = new ArrayList<>();
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

    public void addPlayer(Player player) {
        players.add(player);
    }

    public int playerCount() {
        return players.size();
    }

    public void deal(int cardCount) {
        for (Player player : players) {
            for (int i = 0; i<cardCount; i++) {
                player.setCard(deck.takeCard());
            }
        }
    }

    public Player winner() {
        Player winningPlayer = null;
        for (Player player : players) {
            if (winningPlayer == null || player.getHandValue() > winningPlayer.getHandValue()) {
                winningPlayer = player;
            }
        }

        return winningPlayer;
    }
}
