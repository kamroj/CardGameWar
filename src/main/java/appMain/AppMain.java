package appMain;

// TODO Wojciech Makieła - ctrl + o to clean up your imports
import cards.Card;
import cards.DeckHandler;
import consolegui.GuiDisplay;
import game.GameHandler;
import settings.ISetting;
import settings.Settings;

/**
 * @author Kamil Rojek
 */

// TODO Marcin Ogorzalek - application is not working
public class AppMain {
    public static void main(String[] args) {
        ISetting settings = new Settings();
        DeckHandler deckHandler = new DeckHandler(settings);

        //GameHandler gameHandler = new GameHandler(deckHandler);//TODO krzysiek remove
        GuiDisplay guiDisplay = new GuiDisplay(settings);
        guiDisplay.initializeDisplay();
    }
}
