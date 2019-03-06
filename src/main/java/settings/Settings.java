package settings;

/**
 * @author Kamil Rojek
 */
public class Settings implements ISetting {
    private int numberOfPlayers;
    private int numberOfDecks;
    private int numberOfJockers;

    //temp
    public final int PLAYERS = 2;
    public final int DECKS = 1;
    public final int JOCKERS = 2;


    @Override
    public void setNumberOfPlayers(int number) {
        numberOfPlayers = number;
    }

    @Override
    public void setNumberOfDecks(int number) {
        numberOfDecks = number;
    }

    @Override
    public void setNumberOfJokers(int number) {
        numberOfJockers = number;
    }

    public int getNumberOfPlayers(){
        return numberOfPlayers;
    }

    public int getNumberOfDecks() {
        return numberOfDecks;
    }

    public int getNumberOfJockers() {
        return numberOfJockers;
    }
}
