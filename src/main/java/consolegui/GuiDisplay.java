package consolegui;

/**
 * @author Kamil Rojek
 */
public class GuiDisplay {

    public void initializeDisplay() {
        displayConsoleInterface();

    }


    private void displayConsoleInterface(){
        System.out.println("CARD GAME ----- WAR!");
        System.out.println("\nWhat would you like to do? Press from 1 - 3");
        System.out.println("1. Start new game");
        System.out.println("2. Options (not avaible at the moment)");
        System.out.println("3. Exit");
    }
}
