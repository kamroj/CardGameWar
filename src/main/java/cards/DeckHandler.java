package cards;

import settings.ISetting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Kamil Rojek
 */
public class DeckHandler {
    private int numberOfDecks;
    private int numberOfJockers;

    //change for multiple decks
    private List<Card> deck;

    public DeckHandler(ISetting setting) {
        this.numberOfDecks = setting.getNumberOfDecks();
        this.numberOfJockers = setting.getNumberOfJockers();
    }

    public List<Card> getDeck() {
        var deck = getFilledDeck();
        shuffleDeck(deck);
        return deck;
    }

    private List<Card> getFilledDeck(){
        List<Card> deck = new ArrayList<>();

        for (var type: Card.Type.values()) {
            for (var value : Card.Value.values()){
                if (value != Card.Value.JOKER)
                    deck.add(new Card(type, value));
            }
        }

        addJokersToDeck(deck);
        return deck;
    }

    private void addJokersToDeck(List<Card> deck) {
        for (int i = 0; i < numberOfJockers ; i++) {
            deck.add(new Card(Card.Value.JOKER));
        }
    }

    //change to shuffle and return new deck -- multiple
    private void shuffleDeck(List<Card> deck) {
        Collections.shuffle(deck);
    }

    public void debugLog(){
        //debug
        int number = 1;
        for (Card card : deck){
            System.out.println(number + " card: " + card.getCardType() + " " + card.getCardValue());
            number++;
        }
        //endDebug
    }
}
