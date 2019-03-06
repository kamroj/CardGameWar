package game;

import cards.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kamil Rojek
 */
public class Table { //TODO krzysiek package private and all methods
    private List<Card> cardsOnTable;

    public Table () {
        cardsOnTable = new ArrayList<>();
    }

    public void stackCards(Card card) {
        cardsOnTable.add(card);
    }

    public void giveCardsToPlayer(Player player) {
        // TODO Wojciech Makieła - player.playerCards.addAll(cardsOnTable)
        for (Card card : cardsOnTable) {
            player.playerCards.add(card);
        }
    }

    public void resetStackCards() {
        cardsOnTable.clear();
    }

}
