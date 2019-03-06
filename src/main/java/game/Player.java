package game;

import cards.Card;
import cards.DeckHandler;
import settings.ISetting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kamil Rojek
 */
public class Player {
    List<Card> playerCards;

    public Player() {
        playerCards = new ArrayList<>();
    }

    public Card getSingleCard() {
        if (playerCards.size() == 0) {
            return null;
        }
        return playerCards.get(playerCards.size()-1);
    }

}
