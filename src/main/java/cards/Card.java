package cards;

/**
 * @author Kamil Rojek
 */
public class Card {
    private Value value;
    private Type type;

    public Card(Value value) {
        type = Type.CLUBS;
        this.value = value;
    }

    public Card(Type type, Value value) {
        this.type = type;
        this.value = value;
    }

    public Value getCardValue() {
        return value;
    }

    public Type getCardType() {
        return type;
    }

    enum Value {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QEEN(12), KING(13), ACE(14), JOKER(15);

        int value;

        private Value(int value) {
            this.value = value;
        }
    }

    enum Type {
        SPADES, HEARTS, DIAMONDS, CLUBS
    }
}
