package tournament;

import tournament.interfaces.IPointDistributionBehavior;
import tournament.interfaces.ITableEntry;

public class DefaultPointDistributionBehavior implements IPointDistributionBehavior {

    @Override
    public void addPointsToTableEntries(
            ITableEntry homeTeamTableEntry,
            ITableEntry awayTeamTableEntry,
            GameResult gameResult) {
        // TODO:
        // this method should add points to the table entries depending on
        // the game result
        throw new UnsupportedOperationException("Unimplemented method 'addPointsToTableEntries'");
    }

}
