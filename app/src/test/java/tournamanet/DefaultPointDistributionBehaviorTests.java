package tournamanet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tournament.DefaultPointDistributionBehavior;
import tournament.TableEntry;
import tournament.Team;
import tournament.interfaces.IPointDistributionBehavior;
import tournament.interfaces.ITableEntry;
import tournament.interfaces.ITeam;

public class DefaultPointDistributionBehaviorTests {
    private IPointDistributionBehavior pointDistributionBehavior;
    private ITeam changeFirstTeamName;
    private ITeam changeSecondTeamName;
    private ITableEntry firstTeamTableEntry;
    private ITableEntry secondTableEntry;

    @BeforeEach
    public void setUp() {
        pointDistributionBehavior = new DefaultPointDistributionBehavior();

        changeFirstTeamName = new Team("first");
        changeSecondTeamName = new Team("second");

        firstTeamTableEntry = new TableEntry();
        firstTeamTableEntry.setTeam(changeFirstTeamName);

        secondTableEntry = new TableEntry();
        secondTableEntry.setTeam(changeSecondTeamName);
    }

    @AfterEach
    public void tearDown() {
        pointDistributionBehavior = null;

        firstTeamTableEntry = null;
        secondTableEntry = null;

        changeFirstTeamName = null;
        changeSecondTeamName = null;
    }

    @Test
    public void whatShouldITest() {
        // TODO
    }
}
