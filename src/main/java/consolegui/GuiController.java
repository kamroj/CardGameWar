package consolegui;

import java.util.Scanner;

/**
 * @author Kamil Rojek
 */
public class GuiController {
    private Scanner sc;
    private GuiDisplay guiDisplay;

    public GuiController(GuiDisplay guiDisplay) {
        this.guiDisplay = guiDisplay;
    }

    public void handleControl(){
        int input = getInput();
        if (inputValidation((input)) == false)
            input = getInput();

//        switch (input) {
//            case 1:
//
//        }
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
}
