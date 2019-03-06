package settings;

/**
 * @author Kamil Rojek
 */
public class Settings implements ISetting {
    private int numberOfPlayers;
    private int numberOfDecks;
    private int numberOfJockers;

    //temp
    private final int PLAYERS = 2;
    private final int DECKS = 1;
    private final int JOCKERS = 2;


    //TODO krzysiek what is the purpouse of this? they are never used

    public void setNumberOfPlayers(int number) {
        numberOfPlayers = number;
    }

    public void setNumberOfDecks(int number) {
        numberOfDecks = number;
    }

    public void setNumberOfJokers(int number) {
        numberOfJockers = number;
    }

    @Override
    public int getNumberOfPlayers(){
        return PLAYERS;
    }

    @Override
    public int getNumberOfDecks() {
        return DECKS;
    }

    @Override
    public int getNumberOfJockers() {
        return JOCKERS;
    }
}
