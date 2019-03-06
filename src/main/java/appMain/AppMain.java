package appMain;

import cards.Card;
import cards.DeckHandler;
import consolegui.GuiDisplay;
import game.GameHandler;
import settings.ISetting;
import settings.Settings;

/**
 * @author Kamil Rojek
 */
public class AppMain {
    public static void main(String[] args) {
        ISetting settings = new Settings();
        DeckHandler deckHandler = new DeckHandler(settings);

        //GameHandler gameHandler = new GameHandler(deckHandler);
        GuiDisplay guiDisplay = new GuiDisplay(settings);
        guiDisplay.initializeDisplay();
    }
}
