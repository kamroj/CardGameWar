package cards;

import settings.ISetting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kamil Rojek
 */
public class DeckHandler {
    private int numberOfDecks;
    private List<Card> deck;

    public DeckHandler(ISetting setting) {
        this.numberOfDecks = setting.getNumberOfDecks();
    }

    private List<Card> getFilledDeck(){
        List<Card> deck = new ArrayList<>();

        for (var type: Card.Type.values()) {
            for (var value : Card.Value.values()){
                deck.add(new Card(type, value));
            }
        }
        //debug
        int number = 1;
        for (Card card : deck){
            System.out.println(number + " card: " + card.getCardType() + " " + card.getCardValue());
        }

        //endDebug

        return deck;
    }
}
