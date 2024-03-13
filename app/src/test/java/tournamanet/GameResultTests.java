package tournamanet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tournament.Team;
import tournament.interfaces.ITeam;

public class GameResultTests {

    private ITeam changeFirstTeamName;
    private ITeam changeSecondTeamName;

    @BeforeEach
    public void setUp() {
        changeFirstTeamName = new Team("FirstTeam");
        changeSecondTeamName = new Team("SecondTeam");
    }

    @Test
    public void mySuperDuperTestName() {
        // TODO
    }
}
