package game;

import cards.Card;
import cards.DeckHandler;
import settings.ISetting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kamil Rojek
 */
public class GameHandler {
    // TODO Wojciech Makieła - access modifiers! Keep things private
    DeckHandler deck;
    List<Player> players;
    Table table;

    private boolean draw = false;

    public GameHandler(DeckHandler deck) {
        this.deck = deck;
        players = new ArrayList<>();
        players.add(new Player());
        players.add(new Player());

    }


    public void startGame() {
        table = new Table();
        givePlayerCards();

        while (players.get(0).playerCards.size() != 0 && players.get(1).playerCards.size() != 0) { // TODO Wojciech Makieła - If you have long logical operation, try extracting it to a new method => for example while(playersHaveCards())
            if (draw == true) { // TODO Wojciech Makieła - if (true == true)... can be written in simpler way - if (true)
                drawPlay();
            } else {
                round();
            }
        }

    }

    private void givePlayerCards() {
        var cardTail = deck.getDeck();
        int cardCounter = 1;

        for (Card card : cardTail) {
            if (cardCounter % 2 == 0) { // TODO Wojciech Makieła - I assume that 2 is number of players. Wouldn't it be nice to pass it via parameter from outside? Easier refactor in the future
                players.get(0).playerCards.add(card);
            } else {
                players.get(1).playerCards.add(card);
            }
            cardCounter++;
        }
    }

    private void round() {
        System.out.println("ROUND MODE");

        var cardPlayerOne = players.get(0).getSingleCard();
        var cardPlayerTwo = players.get(1).getSingleCard();

        //Debug
        System.out.println("Player one : " + cardPlayerOne.getCardValue());
        System.out.println("Player two : " + cardPlayerTwo.getCardValue());

        //Change to dyn list  // TODO Wojciech Makieła - what 'dyn' stands for? You write code once. It will be read many times.
        table.stackCards(cardPlayerOne);
        table.stackCards(cardPlayerTwo);

        if (cardPlayerOne.getCardValue().value > cardPlayerTwo.getCardValue().value) {
            System.out.println("Player one won: " + cardPlayerOne.getCardValue());
            table.giveCardsToPlayer(players.get(0));
        } else if (cardPlayerOne.getCardValue().value < cardPlayerTwo.getCardValue().value) {
            System.out.println("Player two won: " + cardPlayerTwo.getCardValue());
            table.giveCardsToPlayer(players.get(1));
        } else {
            System.out.println("DRAWWWWW");
            draw = true;
        }

        //Debug
        System.out.println("Player one cards " + players.get(0).playerCards.size());
        System.out.println("Player two cards " + players.get(1).playerCards.size());

        table.resetStackCards();
    }

    private void drawPlay() {
        System.out.println("DRAW MODE");

        var cardPlayerOne = players.get(0).getSingleCard();
        var cardPlayerTwo = players.get(1).getSingleCard();

        table.stackCards(cardPlayerOne);
        table.stackCards(cardPlayerTwo);

        if (cardPlayerOne.getCardValue().value > cardPlayerTwo.getCardValue().value) {
            System.out.println("Player one won: " + cardPlayerOne.getCardValue());
            table.giveCardsToPlayer(players.get(0));
        } else if (cardPlayerOne.getCardValue().value < cardPlayerTwo.getCardValue().value) {
            System.out.println("Player two won: " + cardPlayerTwo.getCardValue());
            table.giveCardsToPlayer(players.get(1));
        } else {
            drawPlay();
        }

        table.resetStackCards();
    }

}
