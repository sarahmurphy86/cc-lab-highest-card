public class Card {
    SuitType suit;
    ValueType value;

    Card(SuitType suit, ValueType value) {
        this.suit = suit;
        this.value = value;
    }

    public SuitType getSuit() {
        return this.suit;
    }

    public ValueType getValue() {
        return this.value;
    }
}
