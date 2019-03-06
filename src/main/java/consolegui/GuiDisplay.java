package consolegui;

import cards.DeckHandler;
import game.GameHandler;
import settings.ISetting;

import java.util.Scanner;

/**
 * @author Kamil Rojek
 */

// TODO Marcin Ogorzalek - can be named View
public class GuiDisplay {
    private Scanner sc;
    private GameHandler gameHandler;

    public GuiDisplay(ISetting setting) {
        gameHandler = new GameHandler(new DeckHandler(setting));
    }

    public void initializeDisplay() {
        displayConsoleInterface();
        handleControl();

    }


    private void handleControl(){
        int input = getInput();
        if (inputValidation((input)) == false)
            input = getInput();

        switch (input) {
            case 1:
                gameHandler.startGame();
                default:
                    break;


        }
    }

    private int getInput(){
        sc = new Scanner(System.in);
        while(!(sc.hasNextInt())) {
            System.out.println("Input is invalid!");
            sc.next();
        }
        return sc.nextInt();
    }

    private boolean inputValidation(int input) {
        if (input < 1 || input > 3) {
            System.out.println("Type 1, 2 or 3.");
            return false;
        }
        return true;
    }


    private void displayConsoleInterface(){
        System.out.println("CARD GAME ----- WAR!");
        System.out.println("\nWhat would you like to do? Press from 1 - 3");
        System.out.println("1. Start new game");
        System.out.println("2. Options (not avaible at the moment)");
        System.out.println("3. Exit");
    }
}
