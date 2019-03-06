package settings;

/**
 * @author Kamil Rojek
 */
public interface ISetting {
    int getNumberOfPlayers();
    int getNumberOfDecks();
    int getNumberOfJockers(); // TODO Wojciech Makieła - Jokers, not Jockers. Intellij shows you this error
}
